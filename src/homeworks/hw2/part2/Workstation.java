package homeworks.hw2.part2;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Workstation extends Laptop {
    private int batteryVolume;

    public Workstation(int ram, int cpuHz, String manufacturer, String model, double inch, int batteryVolume) {
        super(ram, cpuHz, manufacturer, model, inch);
        this.batteryVolume = batteryVolume;
    }
}
