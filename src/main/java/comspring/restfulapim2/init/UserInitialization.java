package comspring.restfulapim2.init;


import comspring.restfulapim2.domain.User;
import comspring.restfulapim2.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Slf4j
@RequiredArgsConstructor
public class UserInitialization {
    private final UserRepository userRepository;
    @PostConstruct
    void init(){
        log.info("Initializing User Data");
        User user1 = new User();
        user1.setName("Chhun Hokchheng");
        user1.setUsername("YengYeng01");
        user1.setEmail("yengyeng01@example.com");
        user1.setPassword("Hokchheng0909!");
        user1.setIsActive(Boolean.TRUE);

        if(userRepository.count() == 0){
            userRepository.save(user1);
        }


    }

}
