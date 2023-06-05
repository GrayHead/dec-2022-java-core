package lessons.lesson1_base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        String str = "adasd";
////        str = 123;
//        char ch = 65;
//        System.out.println(ch);
//        int i = 18317137;
////        i = "ahsgdhasghd";
//        long lg = 13435353453245L;
//        short sh = (short) -100500000;
//        System.out.println(sh);
//        byte bt = (byte) 123123;
//        System.out.println(bt);
//
//
//        String[] strings = new String[3]; // ['','','']
//        strings[0] = "ajdgj";
//        strings[1] = "ajdgj";
//        strings[2] = "ajdgj";
//        System.out.println(Arrays.toString(strings));
//
//        int[] numbers = {11, 22, 33};
//        System.out.println(Arrays.toString(numbers));
////        numbers[3] = 10050;
//        System.out.println(numbers.length);
//
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//
//        }
//
//        //foreach iter
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//
//
//        // > < >= <= == !=
//        boolean bl = true;
//
//        if (true) {
//
//        } else {
//
//        }
//
//        if (true) {
//
//        } else if (true) {
//
//        } else {
//
//        }
//
//        switch ("adhasdh") {
//
//            case "asdasd":
//                //.....
//                break;
//            default:
//
//        }
//
//
//        User user11 = new User();
////        user11.id = 1;
////        user11.name = "vasyas";
////        user11.status = true;
//        System.out.println(user11);
//
//        User user1 = new User();
//
//
//        User user2 = new User(111, "adasd", false);
//        System.out.println(user2);
//
//        User user3 = new User(123, "sdasd");
//        user3.setId(1000);
//        System.out.println(user3.getId()); // 1000
//
//
//        Person person = new Person();
//        Person person1 = new Person(123,"asdasd",true);


//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("asdasd1");
//        strings.add("asdasd2");
//        strings.add("asdasd3");
//        strings.add("asdasd4");
//        strings.add("asdasd5");
//        System.out.println(strings);
//        strings.get(3);


        ArrayList<String> skills = new ArrayList<>();
        skills.add("java");
        skills.add("js");
        Person person = new Person(1, "vasya", true, skills);
        System.out.println(person);

        person.getSkills().add("html");
        System.out.println(person);


    } // main

} // class

