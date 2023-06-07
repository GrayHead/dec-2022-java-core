package lessons.lesson3_interfaces.demo3_exapmls;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

//        Function<Integer, String> converterFromIntToString = integer -> integer + "!";
//
//        System.out.println(converterFromIntToString.apply(1000)); // "1000"

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

        users.sort((u1, u2) -> u1.getId() - u2.getId());

        System.out.println(users);

        users.sort((o1, o2) -> o1.getId() - o2.getId());
        users.sort(new UserUtil());


    }
}

@Data
@AllArgsConstructor
class User {

    private int id;
    private String name;

}

class UserUtil implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }

}



