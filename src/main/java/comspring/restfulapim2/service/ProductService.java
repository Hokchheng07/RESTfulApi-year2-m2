package comspring.restfulapim2.service;

import comspring.restfulapim2.dto.ProductResponse;

import java.util.List;
import java.util.UUID;

public interface ProductService {

//    Get Product
    List<ProductResponse> getAllProducts();

//    Get By ID

    ProductResponse getProductById(UUID id);


}
