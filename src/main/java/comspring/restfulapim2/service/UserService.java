package comspring.restfulapim2.service;

import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public List<User> getAllUser();

    public User getByUserId(UUID id);

    void deleteById(UUID id);

    User createUser(UserCreateRequest request);
}
