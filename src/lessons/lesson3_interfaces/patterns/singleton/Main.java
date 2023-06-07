package lessons.lesson3_interfaces.patterns.singleton;

public class Main {
    public static void main(String[] args) {


        User instance = User.getInstance();
        User instance1 = User.getInstance();

        System.out.println(instance == instance1);
    }
}

class User {
    private static User intstance;
    //props
    private int id;
    private String name;

    private User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static User getInstance() {
        if (intstance == null) {
            intstance = new User(1, "kokos");
        }
        return intstance;
    }
}
