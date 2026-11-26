package comspring.restfulapim2.service.impl;

import comspring.restfulapim2.dto.ProductResponse;
import comspring.restfulapim2.repository.ProductRepository;
import comspring.restfulapim2.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public List<ProductResponse> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductResponse getProductById(UUID id) {
        return null;
    }
}
