package lessons.strategy.services.user;

import lessons.lesson6_some.reflction.User;

import java.util.List;

public interface UserService {

    void save(User user);


    List<User> read();


}
