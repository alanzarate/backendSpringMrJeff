package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.PickUpBl;
import bo.ucb.edu.backendSpringMrJeff.bl.PrePickUpBl;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.NewPickUpDto;
import bo.ucb.edu.backendSpringMrJeff.dto.PrePickUpResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrBranch;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
public class TestApi {

    private PrePickUpBl prePickUpBl;
    private PickUpBl pickUpBl;
    public TestApi(PrePickUpBl prePickUpBl, PickUpBl pickUpBl) {
        this.pickUpBl = pickUpBl;
        this.prePickUpBl = prePickUpBl;
    }

    @GetMapping("/hours")
    public Map someTest(){
       List<MrSchedule> lista = prePickUpBl.getAllSchedule();
       List<String> horas = new ArrayList<>();
       for(MrSchedule current : lista){
           horas.add(current.getTimeStart() + " - "+  current.getTimeEnd());
       }
        return Map.of("hours", horas);
    }

    @GetMapping("/holydays")
    public Map holidays(){
        return Map.of("holidays", prePickUpBl.getHolidaysInOneMonthStrings());
    }

    @GetMapping("/branches")
    public Map branches(){
        return Map.of("branches", prePickUpBl.getBranchesInfoWithNoStatus());
    }

    @PostMapping(value = "/pickup")
    public ResponseDto<Map<String, Boolean>> newPickUp(@RequestHeader Map<String, String> headers,
                                         @RequestBody NewPickUpDto newPickUpDto) {
        Map<String, Boolean> response = new HashMap<>();
        ResponseDto<Map<String, Boolean>> responseDto = new ResponseDto<>();
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "createPickUp");
            String userName = AuthUtil.getUserNameFromToken(jwt);
            pickUpBl.createNewPickUp(newPickUpDto, userName);

            response.put("wasCreated", true);
            responseDto.setMessage("Se creo el pick up exitosamente");
            responseDto.setSuccess(true);
        }catch (MrJeffException ex){
            response.put("wasCreated", false);
            responseDto.setMessage("Lo sentimos no se pudo crear el pickup");
            responseDto.setSuccess(false);
        }
        responseDto.setData(response);
        return responseDto;


    }

    @GetMapping("/prePickUp/{userId}")
    public ResponseDto<PrePickUpResDto> getPrePickUpInfo(@PathVariable(name = "userId") Integer userId){


        try{
            PrePickUpResDto prePickUpResDto = new PrePickUpResDto();
            //prePickUpResDto.setAddressId(prePickUpBl.getAddressesIdFromUser(userId));
            prePickUpResDto.setDaysPermited(14);
            prePickUpResDto.setAddress(prePickUpBl.getAddressInfoFromUserDto(userId));
            prePickUpResDto.setHolidays(prePickUpBl.getHolidaysInOneMonthStrings());
            prePickUpResDto.setHoras(prePickUpBl.getAllSchedule());

            System.out.println("Llego la solicitud de transmitir la nueva informacion");
            System.out.println(prePickUpResDto);
            //prePickUpResDto.setBranches(prePickUpBl.getBranchesInfoWithNoStatus());
            return new ResponseDto<>(prePickUpResDto, "Se obtuvo los datos con exito", true);


        }catch (Exception ex){

            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);

        }

        //return Map.of("holidays", prePickUpBl.getHolidaysInOneMonthStrings());
    }



    // http://localhost:7777/api/v1/test/prePickUp/branches?lat=-16.642356933136433&lng=-68.28699611991307
    @RequestMapping(method = RequestMethod.GET, value = "/prePickUp/branches")
    public ResponseDto<Map<String, Boolean>> isThisAddressInBounds(
            @RequestParam Map<String, String> customQuery
    ){
        double lat = Double.parseDouble(customQuery.get("lat"));
        double lng = Double.parseDouble(customQuery.get("lng"));

        System.out.println("(testapi) == (isThisAddressInBounds) lat: " + lat + " lng: "+lng);

        MrBranch branchSelected;
        branchSelected = prePickUpBl.isThisAddressValidForService(lat, lng);
        Map<String, Boolean> response = new HashMap<>();
        System.out.println(branchSelected);
        if(branchSelected == null){
            response.put("isValidForService", false);
            System.out.println("llega aqui 1");
        }else{
            System.out.println("llega aqui 2");
            response.put("isValidForService", true);
        }


        return new ResponseDto<>(response, "parece que llego aqui", true);

    }
}
