package comspring.restfulapim2.service;

import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.dto.UserResponse;

import java.util.List;
import java.util.UUID;

public interface UserService {

    public List<UserResponse> getAllUser();

    public UserResponse getByUserId(UUID id);

    void deleteById(UUID id);

    UserResponse createUser(UserCreateRequest request);
}
