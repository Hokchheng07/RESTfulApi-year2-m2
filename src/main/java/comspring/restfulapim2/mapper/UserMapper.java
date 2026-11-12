package comspring.restfulapim2.mapper;


import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.dto.UserResponse;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring" )

public interface UserMapper {

    // Map from domain to DTO

    UserResponse toUserResponse(User user);

    // Map from DTO to domain
    UserCreateRequest fromCreateUserRequest(UserCreateRequest userCreateRequest);

}
