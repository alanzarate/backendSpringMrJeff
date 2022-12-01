package bo.ucb.edu.backendSpringMrJeff.api;

import bo.ucb.edu.backendSpringMrJeff.bl.ScheduleBl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calendar")
public class calendarApi
{
    private ScheduleBl scheduleBl;


    public calendarApi(ScheduleBl scheduleBl)
    {
        this.scheduleBl = scheduleBl;
    }

    @GetMapping("/order/{mr_user_id}")
    public void getOrdersById(@PathVariable(name = "mr_user_id") Integer MrUserId)
    {
        scheduleBl.getOrdersById(MrUserId);
    }

    @GetMapping("/pick_up/{mr_user_id}")
    public void getPickUpsById(@PathVariable(name = "mr_user_id") Integer MrUserId)
    {
        scheduleBl.getPickUpById(MrUserId);
    }

}
