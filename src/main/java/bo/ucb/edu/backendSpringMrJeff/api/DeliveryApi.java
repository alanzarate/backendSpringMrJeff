package bo.ucb.edu.backendSpringMrJeff.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.DeliveryBl;
import bo.ucb.edu.backendSpringMrJeff.dto.BodyClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.util.AuthUtil;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;

@RestController
@RequestMapping(value="/api/v1/delivery", produces = "application/json;charset=UTF-8")
public class DeliveryApi {
    private DeliveryBl deliveryBl;

    public DeliveryApi(DeliveryBl deliveryBl){
        this.deliveryBl = deliveryBl;
    }

    @PostMapping(value="/create")
    public ResponseDto<Map<String, Boolean>> createDelivery(@RequestHeader Map<String,String> headers, @RequestBody BodyClothingOrderDto bodyClothingOrderDto){
        Map<String, Boolean> response = new HashMap<>();
        ResponseDto<Map<String, Boolean>> responseDto = new ResponseDto<>();
        try{
            String jwt = AuthUtil.getTokenFromHeader(headers);
            AuthUtil.verifyHasRole(jwt, "createDelivery");
            String userName = AuthUtil.getUserNameFromToken(jwt);
            deliveryBl.createDelivery(bodyClothingOrderDto, userName);           
            response.put("wasCreated", true);
            responseDto.setMessage("Se creo el delivery exitosamente");
            responseDto.setSuccess(true);
        }catch (MrJeffException ex){
            response.put("wasCreated", false);
            responseDto.setMessage(ex.getMessage());
            responseDto.setSuccess(false);
        }
        responseDto.setData(response);
        return responseDto;

    }
    
}
