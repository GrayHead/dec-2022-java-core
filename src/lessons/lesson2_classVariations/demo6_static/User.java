package lessons.lesson2_classVariations.demo6_static;

public class User {
    public static int userCounter = 0;
    private int id;

    public User() {
        userCounter++;
    }

    public static void greeting() {


    }
}
