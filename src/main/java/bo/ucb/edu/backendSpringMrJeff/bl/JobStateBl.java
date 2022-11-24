package bo.ucb.edu.backendSpringMrJeff.bl;

import bo.ucb.edu.backendSpringMrJeff.dao.*;
import bo.ucb.edu.backendSpringMrJeff.entity.MrDeliver;
import bo.ucb.edu.backendSpringMrJeff.entity.MrOperationState;
import bo.ucb.edu.backendSpringMrJeff.entity.MrPickUp;
import bo.ucb.edu.backendSpringMrJeff.entity.MrUser;
import org.springframework.stereotype.Service;

@Service
public class JobStateBl {
    private MrUserDao mrUserDao;
    private MrOrderDao mrOrderDao;
    private MrPickUpDao mrPickUpDao;
    private MrOperationStateDao mrOperationStateDao;

    private MrDeliverDao mrDeliverDao;

    public JobStateBl(MrUserDao mrUserDao,
                      MrOrderDao mrOrderDao,
                      MrPickUpDao mrPickUpDao,
                      MrOperationStateDao mrOperationStateDao,
                      MrDeliverDao mrDeliverDao
    ) {
        this.mrUserDao = mrUserDao;
        this.mrOrderDao = mrOrderDao;
        this.mrPickUpDao = mrPickUpDao;
        this.mrOperationStateDao = mrOperationStateDao;
        this.mrDeliverDao = mrDeliverDao;
    }

    public Boolean changeState(String username, Integer idOperation, Integer idOperationStateId, String operation, Boolean accepted){
        System.out.println("Esta entrando para cambiar  username: "+ username + " idOpeation:" + idOperation + " idOperationStateId" + idOperationStateId + " operation" + operation);

        boolean response = false;

        try{
            if(operation.compareTo("pickup") == 0){
                System.out.println("Aqui 1");
                MrPickUp mrPickUp = mrPickUpDao.getPickUpById(idOperation);
                System.out.println("Aqui 2");
                if(mrPickUp.getMrOperationStateId().intValue() == idOperationStateId.intValue()){
                    System.out.println("Aqui 3");
                    MrUser mrUser = mrUserDao.findByUsername(username);
                    System.out.println("Aqui 4");
                    if(mrUser != null && mrUser.getUserId() != 0){
                        System.out.println("Aqui 5");
                        MrOperationState mrOperationState = mrOperationStateDao.getMrOperationStateById(idOperationStateId);
                        System.out.println(mrOperationState);
                        System.out.println("Aqui 6");
                        if(mrOperationState.getState().compareTo("requestedPickUp") == 0
                                && mrOperationState.getForOperation().compareTo("pickup") == 0 ){
                            // se procede con el cambio de estado
                            System.out.println("Aqui 7");
                            MrOperationState pickUp = mrOperationStateDao.getMrOperationStateByParameters("pendingPickUp", "pickup");
                            MrOperationState order = mrOperationStateDao.getMrOperationStateByParameters("pendingPickUp", "order");
                            System.out.println("Aqui 8");
                            // update pickup
                            mrPickUpDao.updateValueOfState(pickUp.getMrOperationStateId(), mrUser.getUserId(),  mrPickUp.getMrPickUpId());
                            mrOrderDao.updateValueOfOperationState(order.getMrOperationStateId(),mrPickUp.getMrOrderId());
                            response = true;


                        }
                    }
                }
            }else if(operation.compareTo("delivery") == 0){
                MrDeliver mrDeliver = mrDeliverDao.getDeliverById(idOperation);
                if(mrDeliver.getMrOperationStateId().intValue() == idOperationStateId.intValue()){
                    MrUser mrUser = mrUserDao.findByUsername(username);
                    if(mrUser != null && mrUser.getUserId() != 0){
                        MrOperationState mrOperationState = mrOperationStateDao.getMrOperationStateById(idOperation);
                        if(mrOperationState.getState().compareTo("requestedDeliver") == 0
                                && mrOperationState.getForOperation().compareTo("delivery") == 0 ){
                            // se procede con el cambio de estado
                            MrOperationState deliver = mrOperationStateDao.getMrOperationStateByParameters("pendingDeliver", "delivery");
                            MrOperationState order = mrOperationStateDao.getMrOperationStateByParameters("pendingDeliver", "order");

                            // update pickup
                            mrDeliverDao.updateValueOfState(deliver.getMrOperationStateId(), mrUser.getUserId(), mrDeliver.getMrDeliverId());
                            mrOrderDao.updateValueOfOperationState(order.getMrOperationStateId(),mrDeliver.getMrOrderId());
                            response = true;


                        }
                    }
                }
            }
        }catch (Exception ex){
            System.out.println("fallos en actulaizar el estado" + ex.getMessage());
        }

        return response;



    }
}
