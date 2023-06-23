package lessons.strategy;

import lessons.lesson6_some.reflction.User;
import lessons.strategy.services.user.IUserServiceTwo;
import lessons.strategy.services.user.UserService;

public class Main {
    public static void main(String[] args) {


//        Service service = new IServiceOne();
        UserService userService = new IUserServiceTwo();


        userService.save(new User());

        System.out.println(userService.read());


    }
}
