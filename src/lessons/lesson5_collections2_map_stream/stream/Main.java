package lessons.lesson5_collections2_map_stream.stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));


//        Set<String> collect = users.stream()
////                .skip(200)
//                .distinct()
//                .sorted((o1, o2) -> o1.getId() - o2.getId())
////                .filter(user -> user.getId() > 2)
////                .limit(100)
//                .map(user -> user.getId() + " " + user.getName())
////                .count();
////                .toList();
//                .collect(Collectors.toSet());
//
//        System.out.println(collect);

        Optional<User> any = users.stream().findAny();// null pointer ex
        any.orElse(new User(1999, "john doe"));


    }
}

@Data
@AllArgsConstructor
class User {
    private int id;
    private String name;
}


