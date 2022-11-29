package bo.ucb.edu.backendSpringMrJeff.api;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.DeliveryBl;
import bo.ucb.edu.backendSpringMrJeff.dto.BodyClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;

@RestController
@RequestMapping(value="/api/v1/delivery", produces = "application/json;charset=UTF-8")
public class DeliveryApi {
    private DeliveryBl deliveryBl;

    public DeliveryApi(DeliveryBl deliveryBl){
        this.deliveryBl = deliveryBl;
    }

    @PostMapping(value="/create")
    public ResponseDto createDelivery(@RequestHeader Map<String,String> headers, @RequestBody BodyClothingOrderDto bodyClothingOrderDto){
        try{
            deliveryBl.createDelivery(bodyClothingOrderDto);
            return new ResponseDto(null, null, true);
        }catch (Exception ex){
            return new ResponseDto(null, "Ocurrio un error al crear la entrega", false);
        }
    }
    
}
