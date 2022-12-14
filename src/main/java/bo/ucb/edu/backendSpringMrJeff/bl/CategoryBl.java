package bo.ucb.edu.backendSpringMrJeff.bl;

import java.util.List;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrCategoryClothDao;
import bo.ucb.edu.backendSpringMrJeff.dto.CategoryClothDto;

@Service
public class CategoryBl {
    private MrCategoryClothDao mrCategoryClothDao;
    
    public CategoryBl(MrCategoryClothDao mrCategoryClothDao){
        this.mrCategoryClothDao = mrCategoryClothDao;
    }

    public List<CategoryClothDto> findAllCategoryCloth(){
        return mrCategoryClothDao.findAllCategoryCloth();
    }
}
