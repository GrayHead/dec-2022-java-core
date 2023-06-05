package lessons.lesson2_classVariations.demo2_enum;

public class Main {
    public static void main(String[] args) {


//        User aaaa = new User(111, "aaaa", Gender.FEMALE);


        Gender[] enumGenderValuesArray
                = Gender.values();
        for (Gender gender : enumGenderValuesArray) {
            System.out.println(gender.name() + " " + gender.ordinal());
        }

    }
}
