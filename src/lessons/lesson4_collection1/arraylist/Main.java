package lessons.lesson4_collection1.arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        ArrayList<String> strings = new ArrayList<>(100); 151
        ArrayList<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("three");
        strings.add(0, "two");
        System.out.println(strings);
        String x = strings.get(0);
        System.out.println(x);
        System.out.println(strings.size());
//        strings.clear();
        System.out.println(strings.contains(new String("three")));

        String s1 = "xxx";
        String s2 = "xxx";
        String s3 = new String("xxx");

        s1.equals(s3);

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false


        List<User> users = new ArrayList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));

//        System.out.println(users);
//        System.out.println(users.contains(new User(3, "banan")));
//
////        users.sort((o1, o2) -> o1.getId() - o2.getId());
////        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
////        users.forEach(user -> System.out.println(user));
//
//        users.remove(new User(3, "banan"));
//        System.out.println(users);


//        for (User user : users) {
//            if (user.getId() % 2 == 0) {
//                users.remove(user);
//            }
//        }


//        users.removeIf(user -> user.getId() % 2 == 0);
//        System.out.println(users);
//        Iterator<User> iterator = users.iterator();
//        while (iterator.hasNext()) {
//            User next = iterator.next();
//            if (next.getId() % 2 == 0) {
//                iterator.remove();
//            }
//        }
//        System.out.println(users);


    }
}
