package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.PrePickUpBl;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.entity.MrSchedule;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/test")
public class TestApi {

    private PrePickUpBl prePickUpBl;

    public TestApi(PrePickUpBl prePickUpBl) {
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


    /*

    formato de json request of new pickup
    {

    "address":
        {
            "addressId": 0,
            "name": "Las normandias",
            "latitude":  -16.522523658467236,
            "longitud": -68.10490805079921,
            "detail": "",
            "addressLink":""
        },
    "userId": 1,
    "timeId":2,
    "date":"2022-11-16"
}
     */
}
