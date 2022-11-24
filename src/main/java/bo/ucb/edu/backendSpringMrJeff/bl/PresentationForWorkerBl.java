package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.*;
import bo.ucb.edu.backendSpringMrJeff.dto.OperationInfoResDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import bo.ucb.edu.backendSpringMrJeff.entity.model.DeliverDetailModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.OperationInfoModel;
import bo.ucb.edu.backendSpringMrJeff.entity.model.PickUpDetailsModel;
import bo.ucb.edu.backendSpringMrJeff.util.DateTransforming;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PresentationForWorkerBl {
    private MrAddressDao mrAddressDao;
    private MrOrderDao mrOrderDao;
    private MrPickUpDao mrPickUpDao;
    private MrHolidayDao mrHolidayDao;
    private MrScheduleDao mrScheduleDao;
    private MrUserDao mrUserDao;
    private MrDeliverDao mrDeliverDao;
    public PresentationForWorkerBl(
            MrAddressDao mrAddressDao,
            MrOrderDao mrOrderDao,
            MrPickUpDao mrPickUpDao,
            MrHolidayDao mrHolidayDao,
            MrScheduleDao mrScheduleDao,
            MrUserDao mrUserDao,
            MrDeliverDao mrDeliverDao) {
        this.mrAddressDao = mrAddressDao;
        this.mrOrderDao = mrOrderDao;
        this.mrPickUpDao = mrPickUpDao;
        this.mrHolidayDao = mrHolidayDao;
        this.mrScheduleDao = mrScheduleDao;
        this.mrUserDao = mrUserDao;
        this.mrDeliverDao = mrDeliverDao;
    }

    public OperationInfoResDto getResponseOfOperationsByUser(String userName){
        OperationInfoResDto response = new OperationInfoResDto();

        // obentemos los pickups para ser selecionados
        List<PickUpDetailsModel> availablePickUps = mrPickUpDao.getPickUpAvailableForService();
        List<OperationInfoModel>  pickUps = getListForCourierPickUp(availablePickUps);
        //pickups cargados

        // obtenemos los deliveries disponibles
        List<DeliverDetailModel> availableDeliver = mrDeliverDao.getDeliverAvailableForService();
        List<OperationInfoModel> delivers = getListForCourierDeliver(availableDeliver);
        // deliver cargados

        //combinando las listas
        List<OperationInfoModel> allOperations = new ArrayList<>();
        allOperations.addAll(pickUps);
        allOperations.addAll(delivers);
        // listas unidas en allOperations

        // lo ponemos en las dto
        response.setAvailableOperations(allOperations);

        // obtenemos las operaciones que hace el usuario
        MrUser user = mrUserDao.findByUsername(userName);
        List<PickUpDetailsModel> pickUpsUserInvolved = mrPickUpDao.getPickUpUserInvolved(user.getUserId());
        List<OperationInfoModel> pickUpsInvolved = getListForCourierPickUp(pickUpsUserInvolved);

        List<DeliverDetailModel> deliveriesUserInvolved = mrDeliverDao.getDeliveriesUserInvolved(user.getUserId());
        List<OperationInfoModel> deliveriesInvolved = getListForCourierDeliver(deliveriesUserInvolved);

        // merge a las dos listas
        List<OperationInfoModel> allOperationsInvolved = new ArrayList<>();
        allOperationsInvolved.addAll(pickUpsInvolved);
        allOperationsInvolved.addAll(deliveriesInvolved);

        // asignar
        response.setCurrentOperations(allOperationsInvolved);


        return response;



    }

    private List<OperationInfoModel> getListForCourierPickUp(List<PickUpDetailsModel> availablePickUps){
        List<OperationInfoModel> pickUps = new ArrayList<>();

        for(PickUpDetailsModel p : availablePickUps){
            String date = DateTransforming.getBeautyDate(p.getDateOpe());
            pickUps.add(
                    new OperationInfoModel(
                            p.getMrPickUpId(),
                            date,
                            DateTransforming.getShortTime(p.getTimeStart()),
                            DateTransforming.getShortTime(p.getTimeEnd()),
                            p.getForOperation(),
                            p.getLatitude(),
                            p.getLongitude(),
                            p.getMrOperationStateId(),
                            p.getDescriptionState(),
                            p.getFirstName() + " "+p.getLastName()
                    )
            );

        }
        return pickUps;
    }

    private List<OperationInfoModel> getListForCourierDeliver(List<DeliverDetailModel> deliverDetailModels){
        List<OperationInfoModel> delivers = new ArrayList<>();

        for(DeliverDetailModel p : deliverDetailModels){
            String date = DateTransforming.getBeautyDate(p.getDateOpe());
            delivers.add(
                    new OperationInfoModel(
                            p.getMrDeliverId(),
                            date,
                            DateTransforming.getShortTime(p.getTimeStart()),
                            DateTransforming.getShortTime(p.getTimeEnd()),
                            p.getForOperation(),
                            p.getLatitude(),
                            p.getLongitude(),
                            p.getMrOperationStateId(),
                            p.getDescriptionState(),
                            p.getFirstName() + " "+p.getLastName()
                    )
            );

        }
        return delivers;
    }

}
