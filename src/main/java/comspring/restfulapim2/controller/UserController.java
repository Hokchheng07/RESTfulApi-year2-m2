package comspring.restfulapim2.controller;


import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAllUser();

    };

    @GetMapping("{id}")
    public  User getUserById(
            @PathVariable UUID id
    ){

        return userService.getByUserId(id);

    };

    @PostMapping
    public User createUser( @RequestBody UserCreateRequest request){
        return userService.createUser(request);
    }

    @DeleteMapping
    public void deleteById(UUID id){
        userService.deleteById(id);
    }


}
