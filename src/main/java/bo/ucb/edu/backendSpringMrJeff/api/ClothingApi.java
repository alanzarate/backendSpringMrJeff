package bo.ucb.edu.backendSpringMrJeff.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.ClothingBl;
import bo.ucb.edu.backendSpringMrJeff.dto.ClothingDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrClothingCard;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;

@RestController
@RequestMapping("/api/v1/clothing")
public class ClothingApi {
    private ClothingBl clothingBl;
    public ClothingApi(ClothingBl clothingBl){
        this.clothingBl = clothingBl;
    }
    

    @GetMapping("/category/{id}")
    public ResponseDto<List<MrClothingCard>> getProductsbyCategory(@PathVariable(name="id") Integer id){
        try{
            List<MrClothingCard> products = clothingBl.getAllClothings(id);
            return new ResponseDto<List<MrClothingCard>>(products, null, true);
        } catch (Exception ex) {
            return new ResponseDto<>(null, "Ocurrio un error al obtener los productos", false);
        }
    }

    @GetMapping("/{id}")
    public ResponseDto<ClothingDto> getProductById(@PathVariable(name="id") Integer id){
        try{
            ClothingDto clothing = clothingBl.getClothingById(id);
            return new ResponseDto<ClothingDto>(clothing, null, true);
        } catch (Exception ex) {
            return new ResponseDto<>(null, "Ocurrio un error al obtener el producto", false);
        }
    }

    
}
