package lessons.lesson5_collections2_map_stream;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, User> map = new HashMap();
//        Map<String,User> map = new LinkedHashMap();
//        Map<String, User> map = new TreeMap();
        map.put("kokos", new User(1, "anatoliy"));
        map.put("abrikos", new User(2, "dilinger"));
        map.put("doctor", new User(3, "max"));
        map.put("doctor", new User(4, "anna"));

//        System.out.println(map);
////        map.forEach((s, user) -> {
////            System.out.println(s);
////            System.out.println(user);
////        });
//
//        Set<String> strings = map.keySet();
//
//        Collection<User> values = map.values();

        Set<Map.Entry<String, User>> entries = map.entrySet();

        Iterator<Map.Entry<String, User>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, User> next = iterator.next();
            if (next.getKey().equals("doctor")) {
                iterator.remove();
            }

        }
        System.out.println(map);
//        entries.removeIf()

    }
}

@Data
@AllArgsConstructor
class User implements Comparable<User> {
    private int id;
    private String name;

    @Override
    public int compareTo(User o) {
        return 0;
    }
}
