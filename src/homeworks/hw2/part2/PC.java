package homeworks.hw2.part2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PC {
    private int ram;
    private int cpuHz;
    private String manufacturer;

}
