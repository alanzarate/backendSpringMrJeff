package bo.ucb.edu.backendSpringMrJeff.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.ClothingBl;
import bo.ucb.edu.backendSpringMrJeff.dto.ClothingDto;
import bo.ucb.edu.backendSpringMrJeff.dto.MrClothingCardDto;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;

@RestController
@RequestMapping(value= "/api/v1/clothing", produces = "application/json;charset=UTF-8")
public class ClothingApi {
    private ClothingBl clothingBl;
    public ClothingApi(ClothingBl clothingBl){
        this.clothingBl = clothingBl;
    }

    @GetMapping(value="/category/{id}")
    public ResponseDto<List<MrClothingCardDto>> getProductsbyCategory(@PathVariable(name="id") Integer id){
        try{
            List<MrClothingCardDto> products = clothingBl.getAllClothings(id);
            return new ResponseDto<List<MrClothingCardDto>>(products, null, true);
        } catch (Exception ex) {
            return new ResponseDto<>(null, "Ocurrio un error al obtener los productos", false);
        }
    }

    @GetMapping(value="/{id}")
    public ResponseDto<ClothingDto> getProductById(@PathVariable(name="id") Integer id){
        try{
            ClothingDto clothing = clothingBl.getClothingById(id);
            return new ResponseDto<ClothingDto>(clothing, null, true);
        } catch (Exception ex) {
            return new ResponseDto<>(null, "Ocurrio un error al obtener el producto", false);
        }
    }

    
}
