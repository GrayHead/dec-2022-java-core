package homeworks.hw2.part2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Laptop extends PC {

    private String model;
    private double inch;

    public Laptop(int ram, int cpuHz, String manufacturer, String model, double inch) {
        super(ram, cpuHz, manufacturer);
        this.model = model;
        this.inch = inch;
    }


}
