package lessons.lesson3_interfaces.patterns.delegate;

import lombok.Data;

@Data
public class Car {
    private int id;
    private String model;
    private Engine engine;

    public void ignition() {
        this.getEngine().ignition();
    }
}
