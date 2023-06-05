package lessons.lesson2_classVariations.demo3_extends;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user = new User("asda", "qweqwe", 123);
        user.greeting();
        user.work();

        Human human = new Human();

        List<Human> people = new ArrayList<>();
        people.add(human);
        people.add(user);

        User humanUser1 =(User) people.get(0);
        humanUser1.work();


    }
}
