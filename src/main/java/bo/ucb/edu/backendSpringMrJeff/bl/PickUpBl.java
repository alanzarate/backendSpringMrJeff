package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.*;
import bo.ucb.edu.backendSpringMrJeff.dto.NewPickUpDto;
import bo.ucb.edu.backendSpringMrJeff.dto.OperationInfoResDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrAddress;
import bo.ucb.edu.backendSpringMrJeff.entity.MrOrder;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.entity.auxiliar.Schedule;
import bo.ucb.edu.backendSpringMrJeff.entity.model.DeliverDetailModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.OperationInfoModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.PickUpDetailsModel;
import bo.ucb.edu.backendSpringMrJeff.util.DateTransforming;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class PickUpBl {
    private MrAddressDao mrAddressDao;
    private MrOrderDao mrOrderDao;
    private MrPickUpDao mrPickUpDao;
    private MrHolidayDao mrHolidayDao;
    private MrScheduleDao mrScheduleDao;
    private MrUserDao mrUserDao;
    private MrDeliverDao mrDeliverDao;

    public PickUpBl(
            MrAddressDao mrAddressDao,
            MrOrderDao mrOrderDao,
            MrPickUpDao mrPickUpDao,
            MrHolidayDao mrHolidayDao,
            MrScheduleDao mrScheduleDao,
            MrUserDao mrUserDao,
            MrDeliverDao mrDeliverDao
    ) {
        this.mrAddressDao = mrAddressDao;
        this.mrOrderDao = mrOrderDao;
        this.mrPickUpDao = mrPickUpDao;
        this.mrHolidayDao = mrHolidayDao;
        this.mrScheduleDao = mrScheduleDao;
        this.mrUserDao = mrUserDao;
        this.mrDeliverDao = mrDeliverDao;

    }

    public void createNewPickUp(NewPickUpDto newPickUpDto, String userName){
        MrAddress mrAddress = new MrAddress();
        MrOrder mrOrder = new MrOrder();
        MrPickUp mrPickUp = new MrPickUp();

        mrAddress.setMrAddressId(newPickUpDto.getAddressId());
        mrAddress.setAddressLink(newPickUpDto.getAddressLink());
        mrAddress.setLatitude(newPickUpDto.getLatitude());
        mrAddress.setLongitude(newPickUpDto.getLongitude());
        mrAddress.setName(newPickUpDto.getName());
        mrAddress.setDetail(newPickUpDto.getDetail());
        if(newPickUpDto.getUserId() == 0){

            MrUser user = mrUserDao.findByUsername(userName);
            mrOrder.setMrUserId(user.getUserId());
        }else{
            mrOrder.setMrUserId(newPickUpDto.getUserId());
        }


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
        Schedule schedule = new Schedule();
        mrPickUp.setDateOpe(schedule.getDateFromString("",newPickUpDto.getDate()));
        mrPickUp.setMrAddressId(addressId);
        mrPickUp.setMrScheduleId(newPickUpDto.getTimeId());
        mrPickUp.setMrOrderId(orderId);
        mrPickUp.setCodeGen("123ASD123asd");

        String timeStartString = mrScheduleDao.getTimeStartWithTimeId(newPickUpDto.getTimeId());
        Calendar dateStamp = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        try{
            Date d = dateFormat.parse(timeStartString);


            dateStamp.setTime(schedule.getDateFromString("",newPickUpDto.getDate() ));
            dateStamp.set(Calendar.HOUR_OF_DAY, d.getHours());
            dateStamp.set(Calendar.MINUTE, d.getMinutes());
            dateStamp.set(Calendar.SECOND, d.getSeconds());


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


           mrPickUp.setTimestampPlaned(dateStamp.getTime());



        mrPickUpDao.createNewPickUp(mrPickUp);



   }


}
