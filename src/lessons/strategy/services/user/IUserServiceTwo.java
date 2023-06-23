package lessons.strategy.services.user;

import lessons.lesson6_some.reflction.User;
import lessons.strategy.repositories.UserRepository;

import java.util.List;

public class IUserServiceTwo implements UserService {
    private UserRepository userRepository;

    @Override
    public void save(User user) {
        if (user.getId() == 0) {
            userRepository.save(user);
        }
    }

    @Override
    public List<User> read() {
        return userRepository.read();
    }
}
