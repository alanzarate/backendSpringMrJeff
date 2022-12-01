package bo.ucb.edu.backendSpringMrJeff.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.OrderBl;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.dto.ClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.NewClothingsOrder;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;


@RestController
@RequestMapping("/api/v1/order")
public class OrderApi {
    private OrderBl orderBl;

    public OrderApi(OrderBl orderBl){
        this.orderBl = orderBl;
    }

    @GetMapping(value="/clothings/{id}")
    public ResponseDto<List<ClothingOrderDto>> getClothingsOrder(@PathVariable(name="id") Integer id) {
        List<ClothingOrderDto> clothingOrderDto = orderBl.getClothingOrder(id);
        return new ResponseDto<List<ClothingOrderDto>>(clothingOrderDto, null, true);
    }
    
    @PostMapping(value="/add")
    public ResponseDto<Map<String, String>> updateOrder(@RequestHeader Map<String,String> headers, @RequestBody List<NewClothingsOrder> body) {
        ResponseDto<Map<String,String>> response = new ResponseDto<Map<String,String>>();
        try{
            /* String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "createDelivery");
            String userName = AuthUtil.getUserNameFromToken(jwt); */
            orderBl.addClothingOrder(body);
            response.setSuccess(true);
            response.setMessage("Orden agregada correctamente");
            System.out.println("Orden agregada correctamente");

        }catch (Exception e){
            response.setSuccess(false);
            response.setMessage("Error al agregar la orden");
        }
        return response;
        
    }

}



