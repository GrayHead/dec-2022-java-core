package lessons.lesson2_classVariations.demo1_composition;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Wife {
    private String name;
    private List<String> skills = new ArrayList<>();
}
