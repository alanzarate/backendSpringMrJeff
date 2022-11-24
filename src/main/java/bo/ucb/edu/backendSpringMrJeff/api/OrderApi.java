package bo.ucb.edu.backendSpringMrJeff.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.OrderBl;

@RestController
@RequestMapping("/api/v1/order")
public class OrderApi {
    private OrderBl orderBl;

    public OrderApi(OrderBl orderBl){
        this.orderBl = orderBl;
    }

}
