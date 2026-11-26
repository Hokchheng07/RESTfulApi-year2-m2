package comspring.restfulapim2.repository;

import comspring.restfulapim2.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
