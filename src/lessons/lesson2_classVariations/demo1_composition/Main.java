package lessons.lesson2_classVariations.demo1_composition;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Wife wife = new Wife();
        wife.setName("anna");

        ArrayList<String> skillsofwife = new ArrayList<>();
        wife.setSkills(skillsofwife);

        User user1 = new User(1, "asdasd", wife);
        System.out.println(user1);

        User user2 = new User(2,"asdas","qutqeut",new ArrayList<>());


    }
}
