package comspring.restfulapim2.controller;

import comspring.restfulapim2.dto.ProductResponse;
import comspring.restfulapim2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;


    @GetMapping
    public List<ProductResponse> getAllProducts(){
        return service.getAllProducts();
    }
    @GetMapping("{id}")
    public ProductResponse getProductById(@PathVariable (required = true) UUID id) {
        return service.getProductById(id);
    }

}
