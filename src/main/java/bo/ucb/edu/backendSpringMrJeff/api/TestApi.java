package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.*;
import bo.ucb.edu.backendSpringMrJeff.dto.*;
import bo.ucb.edu.backendSpringMrJeff.entity.MrBranch;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.entity.auxiliar.Schedule;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
public class TestApi {

    private PrePickUpBl prePickUpBl;
    private PickUpBl pickUpBl;
    private PresentationForWorkerBl presentationForWorkerBl;
    private JobStateBl jobStateBl;
    private UserBl userBl;
    public TestApi(PrePickUpBl prePickUpBl,
                   PickUpBl pickUpBl,
                   PresentationForWorkerBl presentationForWorkerBl,
                   JobStateBl jobStateBl,
                   UserBl userBl
                   ) {
        this.pickUpBl = pickUpBl;
        this.prePickUpBl = prePickUpBl;
        this.presentationForWorkerBl = presentationForWorkerBl;
        this.jobStateBl = jobStateBl;
        this.userBl = userBl;
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
            System.out.println("TODO GOOD");
        }catch (MrJeffException ex){
            System.out.println(ex.getMessage());
            response.put("wasCreated", false);
            responseDto.setMessage(ex.getMessage());
            responseDto.setSuccess(false);

        }
        responseDto.setData(response);
        System.out.println("TODO GOOD X2"+ responseDto);
        return responseDto;


    }

    @RequestMapping(method = RequestMethod.GET, value = "/prePickUp/{userId}")
    public ResponseDto<PrePickUpResDto> getPrePickUpInfo(@PathVariable(name = "userId") Integer userId,
                                                         @RequestHeader Map<String, String> headers){

        try{
            PrePickUpResDto prePickUpResDto = new PrePickUpResDto();
            prePickUpResDto.setDaysPermited(14);
            if(userId == 0){
                String jwt = AuthUtil.getTokenFromHeader(headers);
                AuthUtil.verifyHasRole(jwt, "createPickUp");
                String userName = AuthUtil.getUserNameFromToken(jwt);
                prePickUpResDto.setAddress(prePickUpBl.getAddressInfoFromUserDtoByUsername(userName));
            }else{
                prePickUpResDto.setAddress(prePickUpBl.getAddressInfoFromUserDto(userId));
            }

            prePickUpResDto.setHolidays(prePickUpBl.getHolidaysInOneMonthStrings());
            prePickUpResDto.setHoras(prePickUpBl.getAllSchedule());

            System.out.println("Llego la solicitud de transmitir la nueva informacion");
            System.out.println(prePickUpResDto);

            return new ResponseDto<>(prePickUpResDto, "Se obtuvo los datos con exito", true);


        }catch (Exception ex){

            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);

        }


    }


    @RequestMapping(method = RequestMethod.GET, value = "/prePickUpV2/{userId}")
    public ResponseDto<Schedule> getPrePickUpInfoV2(@PathVariable(name = "userId") Integer userId,
                                                    @RequestHeader Map<String, String> headers){
        try{
            System.out.println("Aqui 1");
            Schedule schedule = new Schedule();
//            String jwt = AuthUtil.getTokenFromHeader(headers);
//            AuthUtil.verifyHasRole(jwt, "createPickUp");
//            String userName = AuthUtil.getUserNameFromToken(jwt);
            schedule = prePickUpBl.getPrePickInfoV2( userId , "");

            System.out.println("Llego la solicitud de transmitir la nueva informacion");
            System.out.println(schedule);

            return new ResponseDto<>(schedule, "Se obtuvo los datos con exito", true);


        }catch (Exception ex){
            System.out.println("Aqui 2");
            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);

        }
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

    @RequestMapping(method = RequestMethod.GET, value = "/available")
    public ResponseDto<OperationInfoResDto> getAgendaForCourier(@RequestHeader Map<String, String> headers){

        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "viewPickUp");
            String userName = AuthUtil.getUserNameFromToken(jwt);
            OperationInfoResDto result =  presentationForWorkerBl.getResponseOfOperationsByUser(userName);

            return new ResponseDto<>(result, "Se obtuvieron los datos correctamente", true);
        }catch (MrJeffException ex){
            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);
        }


    }

    @RequestMapping(method = RequestMethod.POST, value = "/confirmjob")
    public ResponseDto<Map<String, Boolean>> workerAcceptRequest(
            @RequestHeader Map<String, String> headers,
            @RequestBody ConfirmJobReqDto confirmJobReqDto
    ){
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "acceptPickUp");
            AuthUtil.verifyHasRole(jwt, "acceptDelivery");
            String userName = AuthUtil.getUserNameFromToken(jwt);


            Boolean hasChanged = jobStateBl.changeState(userName, confirmJobReqDto.getIdJobOperation(), confirmJobReqDto.getIdOperationStateId(), confirmJobReqDto.getOperation(), confirmJobReqDto.getAccepted());
            if(hasChanged){
                return new ResponseDto<>(Map.of("updateStatus", true), "Se obtuvieron los datos correctamente", true);
            }else {

                throw new MrJeffException("No cargo correctamente");
            }

        }catch (MrJeffException ex){
            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "/group")
    public ResponseDto<Map<String, List<String>>> getGroup(@RequestHeader Map<String, String> headers){

        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            String userName = AuthUtil.getUserNameFromToken(jwt);
            List<String> group =  userBl.getGroupUserByUsername(userName);
            return new ResponseDto<>(Map.of("group", group), "Se obtuvieron los datos correctamente", true);
        }catch (MrJeffException ex){
            System.out.println(ex.getMessage());
            return new ResponseDto<>(null, "Ocurrio un error", false);
        }


    }

}
