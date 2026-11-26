package comspring.restfulapim2.mapper;


import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.dto.UserResponse;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring" )

public interface UserMapper {


    UserResponse toUserResponse(User user);


    User fromCreateUserRequest(UserCreateRequest userCreateRequest);

}
