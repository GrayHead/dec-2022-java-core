package lessons.lesson2_classVariations.demo3_extends;

public final class User extends Human {
    private int id;

    public User() {
        super();
    }

    public User(String name, String surname, int id) {
        super(name, surname);
        this.id = id;
    }

//    @Override
//    public void greeting() {
//        System.out.println("wassssuap");
//    }

    public void work() {
        System.out.println("serve");
    }
}
