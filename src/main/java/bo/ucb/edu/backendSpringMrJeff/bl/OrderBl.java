package bo.ucb.edu.backendSpringMrJeff.bl;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrOrderDao;

@Service
public class OrderBl {
    private MrOrderDao mrOrderDao;

    public OrderBl(MrOrderDao mrOrderDao){
        this.mrOrderDao = mrOrderDao;
    }

}
