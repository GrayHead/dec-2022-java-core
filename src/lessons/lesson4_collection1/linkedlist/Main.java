package lessons.lesson4_collection1.linkedlist;


import lessons.lesson4_collection1.arraylist.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = new LinkedList<>();
        users.add(new User(2, "kokos"));
        users.add(new User(1, "ananas"));
        users.add(new User(3, "banan"));
        users.add(new User(5, "tomat"));
        users.add(new User(4, "potatos"));
        users.add(new User(6, "mango"));


        List<User> list = new ArrayList<>(users);
        System.out.println(list);


    }
}
