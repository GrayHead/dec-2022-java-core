package lessons.lesson3_interfaces.patterns.delegate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.getEngine().ignition();
        car.ignition();


    }
}
