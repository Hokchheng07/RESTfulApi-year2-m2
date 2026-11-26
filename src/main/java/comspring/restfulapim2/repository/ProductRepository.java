package comspring.restfulapim2.repository;

import comspring.restfulapim2.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
