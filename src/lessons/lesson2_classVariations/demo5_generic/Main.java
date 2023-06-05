package lessons.lesson2_classVariations.demo5_generic;

public class Main {
    public static void main(String[] args) {

//        User user1 = new User(123,"asdas");
//        User user2 = new User("qiuwety7e712t","asdas");

        User<Integer> user1 = new User<>(111, "asdasd");
//        User<String> objectUser = new User<>("qt712r37yfas", "sadyfhasd");
        User<Double> user3 = new User<>(111.123, "asdasd");



    }
}


