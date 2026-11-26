package comspring.restfulapim2.service.impl;

import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.dto.UserCreateRequest;
import comspring.restfulapim2.dto.UserResponse;
import comspring.restfulapim2.mapper.UserMapper;
import comspring.restfulapim2.repository.UserRepository;
import comspring.restfulapim2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    @Override
    public List<UserResponse> getAllUser() {
        return repository.findAll()
                .stream()
                .map(mapper::toUserResponse)
                .toList()
                ;
    }

    @Override
    public UserResponse getByUserId(UUID id) {
        return  repository.findById(id)
                .map(mapper::toUserResponse)
                .orElseThrow(
                        ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User with id : %d cannot be found".formatted(id))
                );
    }

    @Override
    public void deleteById(UUID id) {
        if (!repository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found");
        }
        repository.deleteById(id);
    }

    @Override
    public UserResponse createUser(UserCreateRequest request) {

        if(repository.existsByEmail(request.email())){
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Email Already Exists");
        };

        User newUser = mapper.fromCreateUserRequest(request);
        newUser.setIsActive(Boolean.TRUE);

        repository.save(newUser);

        return mapper.toUserResponse(newUser);

    }

}
