package comspring.restfulapim2.repository;


import comspring.restfulapim2.domain.User;
import lombok.Getter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@Getter
public class UserRepository {

    private List<User> users;

    public UserRepository() {

        users = new ArrayList<>();

        User userAdmin = new User(UUID.randomUUID(), "administrator","admin","Qwer1234!",true);
        User userMinh = new User(UUID.randomUUID(), "Leang Seavminh","MinhMinh","12345",true);
        User userHak = new User(UUID.randomUUID(), "Men Senghak","HakiHak","abcdefg",true);

        users.add(userAdmin);
        users.add(userMinh);
        users.add(userHak);

    };

    public List<User> selectAll() {

        return users;

    };

    public Optional<User> selectById(UUID id) {

        return  users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();

    };

    public void insert(User user) {

        users.add(user);

    };

}
