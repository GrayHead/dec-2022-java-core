package lessons.lesson3_interfaces.demo1_interface;

public interface Singer {
    /*public static  final*/ int X = 100; // const

    /*public*/ void sing(String s);

    static void lalalend() {
        //....??????
    }

    default String akapelo() {
        return "some string value";
    }
}
