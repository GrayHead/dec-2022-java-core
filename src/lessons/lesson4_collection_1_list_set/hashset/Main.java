package lessons.lesson4_collection_1_list_set.hashset;

import lessons.lesson4_collection_1_list_set.arraylist.User;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users = new HashSet<>();
//        LinkedHashSet<User> users = new LinkedHashSet<>();
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));
        System.out.println(users);


    }
}
