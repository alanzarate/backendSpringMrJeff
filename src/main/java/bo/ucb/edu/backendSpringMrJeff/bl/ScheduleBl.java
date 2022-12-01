package bo.ucb.edu.backendSpringMrJeff.bl;


import bo.ucb.edu.backendSpringMrJeff.dao.MrOrderDao;
import bo.ucb.edu.backendSpringMrJeff.dao.MrPickUpDao;
import bo.ucb.edu.backendSpringMrJeff.dto.OrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.PickUpDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleBl
{
    private MrOrderDao mrOrderDao;
    private MrPickUpDao mrPickUpDao;

    public ScheduleBl(MrOrderDao mrOrderDao, MrPickUpDao mrPickUpDao)
    {
        this.mrOrderDao = mrOrderDao;
        this.mrPickUpDao = mrPickUpDao;
    }

    public List<PickUpDto> getPickUpById(Integer id)
    {
        return mrPickUpDao.getPickUpByUserId(id);
    }

    public List<OrderDto> getOrdersById(Integer id)
    {
        return mrOrderDao.getOrders(id);
    }

}
