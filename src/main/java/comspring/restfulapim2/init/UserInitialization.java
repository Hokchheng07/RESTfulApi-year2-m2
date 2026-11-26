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

        User user2 = new User();
        user2.setName("Leang Seavminh");
        user2.setUsername("MinhMinh02");
        user2.setEmail("minhminh02@example.com");
        user2.setPassword("MinhMinh0909!");
        user2.setIsActive(Boolean.TRUE);

        User user3 = new User();
        user3.setName("Men Senghak");
        user3.setUsername("HakHakii");
        user3.setEmail("hakiHakk03@example.com");
        user3.setPassword("Hakihak0909!");
        user3.setIsActive(Boolean.TRUE);




        if(userRepository.count() == 0){
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }


    }

}
