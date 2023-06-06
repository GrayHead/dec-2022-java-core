package homeworks.hw2.part4;

import lessons.lesson2_classVariations.demo2_enum.Gender;
import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;

}
