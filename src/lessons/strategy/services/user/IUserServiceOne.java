package lessons.strategy.services.user;

import lessons.lesson6_some.reflction.User;
import lessons.strategy.repositories.UserRepository;

import java.util.List;

public class IUserServiceOne implements UserService {
    private UserRepository userRepository;


    public void save(User user) {
        if (user != null) {
            userRepository.save(user);

        } else {
            throw new RuntimeException("something wrong with your user pal");
        }

    }


    public List<User> read() {
        List<User> read = userRepository.read();
        if (!read.isEmpty()) {
            return read;

        }
        return null;
    }


}
