package lessons.lesson2_classVariations.demo5_generic;

public class User<ID extends Number> {
    private ID id;
    private String name;

    public User(ID id, String name) {
        this.id = id;
        this.name = name;
    }
}
