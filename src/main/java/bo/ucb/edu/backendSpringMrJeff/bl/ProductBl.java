package bo.ucb.edu.backendSpringMrJeff.bl;

import java.util.List;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrClothingDao;
import bo.ucb.edu.backendSpringMrJeff.entity.MrClothingCard;

@Service
public class ProductBl {
    private MrClothingDao mrClothingDao;

    public ProductBl(MrClothingDao mrClothingDao){
        this.mrClothingDao = mrClothingDao;
    }

    public List<MrClothingCard> getProductsbyCategory(Integer categoryId){
        return mrClothingDao.getProductsbyCategory(categoryId);
    }
}
