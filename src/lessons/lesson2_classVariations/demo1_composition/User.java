package lessons.lesson2_classVariations.demo1_composition;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User {
    private int id;
    private String name;
    private Wife wife;

    public User(int id, String name,String wifeName, List<String> wifeSkills) {
        this.id = id;
        this.name = name;
        this.wife = new Wife(wifeName, wifeSkills);
    }
}
