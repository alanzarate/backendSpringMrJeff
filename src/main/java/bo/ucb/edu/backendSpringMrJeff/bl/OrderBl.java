package bo.ucb.edu.backendSpringMrJeff.bl;

import java.util.List;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrOrderDao;
import bo.ucb.edu.backendSpringMrJeff.dto.ClothingOrderDto;
import bo.ucb.edu.backendSpringMrJeff.dto.NewClothingsOrder;

@Service
public class OrderBl {
    private MrOrderDao mrOrderDao;

    public OrderBl(MrOrderDao mrOrderDao){
        this.mrOrderDao = mrOrderDao;
    }

    public List<ClothingOrderDto> getClothingOrder(Integer id){
        List<ClothingOrderDto> clothingOrderDto = mrOrderDao.getClothingOrder(id);
        return clothingOrderDto;
    }

    public void addClothingOrder(List<NewClothingsOrder> clothings){
        for(NewClothingsOrder clothing : clothings){
            System.out.println(clothing);
            mrOrderDao.addClothingToOrder(clothing);
        }
    }

}
