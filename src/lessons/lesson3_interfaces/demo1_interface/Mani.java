package lessons.lesson3_interfaces.demo1_interface;

public class Mani {
    public static void main(String[] args) {

        Runner runner = new User();
        runner.run();

        Runner runner2 = new Runner() {
            @Override
            public void run() {
                System.out.println("as fast as you can");
            }

            @Override
            public int foo(int multiplayer) {
                return 0;
            }
        };
        runner2.run();
        runner2.foo(100);


        Singer singer = new User();
        Singer singer2 = new Person();

        Singer[] singers = {new Person(), new User()};

        Singer.lalalend();


        foobar(new User(), "happy new year");


        Person person = new Person();
        person.akapelo(); // from Singer

        User user = new User();
        user.akapelo();


        System.out.println(user instanceof Runner);
    }

    public static void foobar(Singer singer, String whatSongToPlay) {
        singer.sing(whatSongToPlay);

    }
}
