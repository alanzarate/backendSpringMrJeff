package bo.ucb.edu.backendSpringMrJeff.bl;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrDeliverDao;
import bo.ucb.edu.backendSpringMrJeff.dto.BodyClothingOrderDto;

@Service
public class DeliveryBl {
    private MrDeliverDao mrDeliverDao;

    public DeliveryBl(MrDeliverDao mrDeliverDao){
        this.mrDeliverDao = mrDeliverDao;
    }

    public void createDelivery(BodyClothingOrderDto bodyClothingOrderDto){
        mrDeliverDao.createDelivery(bodyClothingOrderDto);
    }
}
