package lessons.lesson2_classVariations.demo2_enum;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private Gender gender;
}
