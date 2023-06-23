package lessons.lesson6_some.annotations;


import lessons.lesson6_some.reflction.User;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        User user = new User(-100, "vasya");
        validatorHandler(user);

    }

    public static void validatorHandler(User user) throws IllegalAccessException {
        Class<? extends User> reflectedUser = user.getClass();
        Field[] declaredFields =
                reflectedUser.getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Validator.class)) {
                field.setAccessible(true);
                Object o = field.get(user);
                int id = (int) o;
                if (id < 0) {
                    Validator validator = field.getAnnotation(Validator.class);
                    String msg = validator.msg();
                    System.out.println(msg);

                }

            }
        }

    }

    //create table into db whith all fields of class
    

}





