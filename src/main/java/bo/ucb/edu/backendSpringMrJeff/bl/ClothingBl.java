package bo.ucb.edu.backendSpringMrJeff.bl;

import java.util.List;

import org.springframework.stereotype.Service;

import bo.ucb.edu.backendSpringMrJeff.dao.MrClothingDao;
import bo.ucb.edu.backendSpringMrJeff.dto.ClothingDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrClothingCardDto;

@Service
public class ClothingBl {
    private MrClothingDao mrClothingDao;

    public ClothingBl(MrClothingDao mrClothingDao){
        this.mrClothingDao = mrClothingDao;
    }

    public List<MrClothingCardDto> getAllClothings(Integer categoryId){
        return mrClothingDao.getClothingsbyCategory(categoryId);
    }

    public ClothingDto getClothingById(Integer id){
        ClothingDto clothing = mrClothingDao.getClothingById(id);
        clothing.setImages(mrClothingDao.getImagesOfClothing(id));
        clothing.setServices(mrClothingDao.getServicesOfClothing(id));
        return clothing;
    }
    
}
