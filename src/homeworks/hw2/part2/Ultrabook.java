package homeworks.hw2.part2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Ultrabook extends Laptop {
    private double weight;

    public Ultrabook(int ram, int cpuHz, String manufacturer, String model, double inch, double weight) {
        super(ram, cpuHz, manufacturer, model, inch);
        this.weight = weight;
    }
}
