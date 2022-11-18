package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.PickUpBl;
import bo.ucb.edu.backendSpringMrJeff.bl.PrePickUpBl;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.dto.AuthResDto;
import bo.ucb.edu.backendSpringMrJeff.dto.NewPickUpDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public ResponseDto<String> newPickUp(@RequestHeader Map<String, String> headers,
                                         @RequestBody NewPickUpDto newPickUpDto) {
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "createPickUp");
            pickUpBl.createNewPickUp(newPickUpDto);
            return new ResponseDto<>("New pick up created succesfully", null, true);
        }catch (MrJeffException ex){
            return new ResponseDto<>(ex.getMessage(), null, false);
        }

    }
}
