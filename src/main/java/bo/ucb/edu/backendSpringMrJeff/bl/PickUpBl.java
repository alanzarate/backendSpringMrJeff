package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.MrAddressDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrOrderDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrPickUpDao;
import bo.ucb.edu.backendSpringMrJeff.dto.NewPickUpDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import bo.ucb.edu.backendSpringMrJeff.entity.MrOrder;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import org.springframework.stereotype.Service;

@Service
public class PickUpBl {
    private MrAddressDao mrAddressDao;
    private MrOrderDao mrOrderDao;
    private MrPickUpDao mrPickUpDao;
    public PickUpBl(
            MrAddressDao mrAddressDao,
            MrOrderDao mrOrderDao,
            MrPickUpDao mrPickUpDao) {
        this.mrAddressDao = mrAddressDao;
        this.mrOrderDao = mrOrderDao;
        this.mrPickUpDao = mrPickUpDao;
    }

    public void createNewPickUp(NewPickUpDto newPickUpDto){
        MrAddress mrAddress = new MrAddress();
        MrOrder mrOrder = new MrOrder();
        MrPickUp mrPickUp = new MrPickUp();

        mrAddress.setMrAddressId(newPickUpDto.getAddressId());
        mrAddress.setAddressLink(newPickUpDto.getAddressLink());
        mrAddress.setLatitude(newPickUpDto.getLatitude());
        mrAddress.setLongitude(newPickUpDto.getLongitude());
        mrAddress.setName(newPickUpDto.getName());
        mrAddress.setDetail(newPickUpDto.getDetail());

        mrOrder.setMrUserId(newPickUpDto.getUserId());

        Integer addressId = mrAddress.getMrAddressId();


        if(mrAddress.getMrAddressId() == 0){

            // se trata de un nuevo lugar
            mrAddressDao.createNewAddress(mrAddress);
            addressId = mrAddressDao.viewLastAddress();
            mrAddress.setMrAddressId(addressId);
            mrAddressDao.createNewAddressUser(addressId, mrOrder.getMrUserId() );
        }


        mrOrderDao.createNewOrder(mrOrder);
        Integer orderId = mrOrderDao.viewLastOrderCreated();
        mrPickUp.setDateOpe(newPickUpDto.getDate());
        mrPickUp.setMrAddressId(addressId);
        mrPickUp.setMrScheduleId(newPickUpDto.getTimeId());
        mrPickUp.setMrOrderId(orderId);
        mrPickUp.setCodeGen("123ASD123asd");



        mrPickUpDao.createNewPickUp(mrPickUp);



    }
}
