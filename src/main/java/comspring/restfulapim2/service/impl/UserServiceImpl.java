package comspring.restfulapim2.service.impl;

import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.repository.UserRepository;
import comspring.restfulapim2.service.UserService;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.selectAll();
    }

    @Override
    public User getByUserId(UUID id) {
        return userRepository.selectById(id).orElseThrow() ;
    }

    @Override
    public void deleteById(UUID id) {
        userRepository.selectAll().removeIf(user -> user.getId().equals(id));
    }

    @Override
    public User createUser(UserCreateRequest request) {

        User newUser = new User();
        newUser.setId(UUID.randomUUID());
        newUser.setName(request.name());
        newUser.setUsername(request.username());
        newUser.setPassword(request.password());
        newUser.setIsActive(Boolean.TRUE);

        userRepository.insert(newUser);

        return newUser;
    }

}
