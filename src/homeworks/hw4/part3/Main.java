package homeworks.hw4.part3;

import homeworks.hw2.part1.Geo;
import lessons.lesson2_classVariations.demo2_enum.Gender;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків

        HashSet<User> users = new HashSet<>();
        users.removeIf(user -> user.getGender().equals(Gender.MALE));

        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            User next = iterator.next();
            if (next.getGender().equals(Gender.MALE)) {
                iterator.remove();
            }
        }
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

        TreeSet<User> treeSet = new TreeSet<>();
        //.........

    }
}

//    Створити клас котрий відповідає наступній моделі
//{
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
// }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків


//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
