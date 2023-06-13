package homeworks.hw4.part3;

import homeworks.hw2.part4.Skill;
import lessons.lesson2_classVariations.demo2_enum.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills = new ArrayList<>();
    private Car car;

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}
