package bo.ucb.edu.backendSpringMrJeff.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bo.ucb.edu.backendSpringMrJeff.bl.ProductBl;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrClothingCard;

@RestController
@RequestMapping("/api/v1/product/category")
public class ProductApi {
    private ProductBl productBl;
    public ProductApi(ProductBl productBl){
        this.productBl = productBl;
    }
    

    @GetMapping("/{id}")
    public ResponseDto<List<MrClothingCard>> getProductsbyCategory(@PathVariable(name="id") Integer id){
        try{
            List<MrClothingCard> products = productBl.getProductsbyCategory(id);
            return new ResponseDto<List<MrClothingCard>>(products, null, true);
        } catch (Exception ex) {
            return new ResponseDto<>(null, null, false);
        }
    }

    
}
