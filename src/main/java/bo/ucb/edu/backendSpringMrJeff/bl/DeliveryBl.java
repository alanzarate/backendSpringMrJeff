package bo.ucb.edu.backendSpringMrJeff.bl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrAddressDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrDeliverDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrScheduleDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrUserDao;
import bo.ucb.edu.backendSpringMrJeff.dto.BodyClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import bo.ucb.edu.backendSpringMrJeff.entity.MrOrder;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.entity.auxiliar.Schedule;

@Service
public class DeliveryBl {
    private MrDeliverDao mrDeliverDao;
    private MrUserDao mrUserDao;
    private MrAddressDao mrAddressDao;
    private MrScheduleDao mrScheduleDao;

    public DeliveryBl(MrDeliverDao mrDeliverDao, MrUserDao mrUserDao, MrAddressDao mrAddressDao, MrScheduleDao mrScheduleDao) {
        this.mrDeliverDao = mrDeliverDao;
        this.mrUserDao = mrUserDao;
        this.mrAddressDao = mrAddressDao;
        this.mrScheduleDao = mrScheduleDao;
    }

    public void createDelivery(BodyClothingOrderDto bodyClothingOrderDto, String name){
        MrAddress mrAddress = new MrAddress();

        mrAddress.setMrAddressId(bodyClothingOrderDto.getAddressId());
        mrAddress.setAddressLink(bodyClothingOrderDto.getAddressLink());
        mrAddress.setLatitude(bodyClothingOrderDto.getLatitude());
        mrAddress.setLongitude(bodyClothingOrderDto.getLongitude());
        mrAddress.setName(bodyClothingOrderDto.getName());
        mrAddress.setDetail(bodyClothingOrderDto.getDetail());


        MrOrder mrOrder = new MrOrder();

        MrUser user = mrUserDao.findByUsername(name);
        mrOrder.setMrUserId(user.getUserId());

        Integer addressId = mrAddress.getMrAddressId();

        if(mrAddress.getMrAddressId() == 0){

            // se trata de un nuevo lugar
            mrAddressDao.createNewAddress(mrAddress);
            addressId = mrAddressDao.viewLastAddress();
            mrAddress.setMrAddressId(addressId);
            mrAddressDao.createNewAddressUser(addressId, mrOrder.getMrUserId() );
        }

        Schedule schedule = new Schedule();
        String timeStartString = mrScheduleDao.getTimeStartWithTimeId(bodyClothingOrderDto.getTimeId());
        Calendar dateStamp = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        try{
            Date d = dateFormat.parse(timeStartString);


            dateStamp.setTime(schedule.getDateFromString("",bodyClothingOrderDto.getDate()));
            dateStamp.set(Calendar.HOUR_OF_DAY, d.getHours());
            dateStamp.set(Calendar.MINUTE, d.getMinutes());
            dateStamp.set(Calendar.SECOND, d.getSeconds());


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }



        mrDeliverDao.createDelivery(
            9,
            addressId,
            0,
            bodyClothingOrderDto.getTimeId(),
            bodyClothingOrderDto.getOrderId(),
            "abcd12314",
            1,
            "admin",
            "localhost"
        );

        
    }
}
