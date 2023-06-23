package lessons.lesson6_some.reflction;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
//        Class<User> userClassReflection = User.class;


        User user = new User(123, "vasya");
        Class<? extends User> userReflection = user.getClass();
        Field[] declaredFields = userReflection.getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            System.out.println("field name - " + field.getName());
            System.out.println("field value - " + field.get(user));
//        Modifier.isPrivate(2)
            System.out.println("Modifiers - " + field.getModifiers());
            System.out.println("type  -" + field.getType());
        }

        Method[] declaredMethods = userReflection.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType());
            System.out.println(method.getModifiers());
            System.out.println(method.getParameterCount());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println(parameter.getType());
                System.out.println(parameter.getName());
                System.out.println(parameter.getModifiers());
            }
            System.out.println("------------------");
        }


        Constructor<?>[] declaredConstructors = userReflection.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            Parameter[] parameters = constructor.getParameters();
        }


    }
}
