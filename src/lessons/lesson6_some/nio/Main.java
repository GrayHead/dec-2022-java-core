package lessons.lesson6_some.nio;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Properties;
import java.util.stream.Stream;

public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        Properties properties = System.getProperties();

//        for (Object o : properties.keySet()) {
//            System.out.println(o);
//        }

//        Paths.get("");

//        Path sszhu = Path.of(System.getProperty("user.home"));
//        Stream<Path> list = Files.list(sszhu);
//        //....
//        list.forEach(path -> System.out.println(path));

        Path file = Paths.get(System.getProperty("user.home") + File.separator + "asd.txt");

        List<String> strings = Files.readAllLines(file);
        //.....
        System.out.println(strings);

        String msg = "flufghsgfhsfg";
        byte[] msgBytes = msg
                .getBytes(StandardCharsets.UTF_8);
        Files.write(file, msgBytes, StandardOpenOption.APPEND);


    }
}
