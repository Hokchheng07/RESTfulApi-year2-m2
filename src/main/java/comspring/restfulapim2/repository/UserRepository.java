package comspring.restfulapim2.repository;

import comspring.restfulapim2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    List<User> id(UUID id);

    boolean existsByEmail(String email);


}
