package lessons.lesson3_interfaces.demo1_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Runner, Singer {
    private int id;
    private String name;

    @Override
    public void run() {
        System.out.println("slow run");

    }

    @Override
    public int foo(int multiplayer) {
        return 100;
    }

    public void sing(String song) {
        System.out.println(song + "!!!!!!!!!");

    }
}
