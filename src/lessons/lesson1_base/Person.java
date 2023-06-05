package lessons.lesson1_base;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {
    int id;
    String name;
    boolean status;
    ArrayList<String> skills = new ArrayList<>();


}
