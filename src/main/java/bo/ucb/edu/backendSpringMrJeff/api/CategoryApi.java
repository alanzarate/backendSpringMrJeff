package bo.ucb.edu.backendSpringMrJeff.api;

import org.springframework.web.bind.annotation.*;

import bo.ucb.edu.backendSpringMrJeff.bl.CategoryBl;
import bo.ucb.edu.backendSpringMrJeff.dto.ResponseDto;
import bo.ucb.edu.backendSpringMrJeff.entity.MrCategoryCloth;
import bo.ucb.edu.backendSpringMrJeff.util.MrJeffException;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/product/category")
public class CategoryApi {
    
    private CategoryBl categoryBl;
    public CategoryApi(CategoryBl categoryBl){
        this.categoryBl = categoryBl;
    }

    @GetMapping(value="/all")
    public ResponseDto<List<MrCategoryCloth>> findAllCategoryCloth(@RequestHeader Map<String, String> headers){
        try{
            //TODO: Verificar permisos JWT
            //String jwt = AuthUtil.getTokenFromHeader(headers);
            //AuthUtil.verifyHasRole(jwt, "findAllCategoryCloth");
            List<MrCategoryCloth> categoryCloth = categoryBl.findAllCategoryCloth();
            return new ResponseDto<List<MrCategoryCloth>>(categoryCloth, null, true);
        } catch (MrJeffException ex) {
            return new ResponseDto<>(null, null, false);
        }
    }


}
