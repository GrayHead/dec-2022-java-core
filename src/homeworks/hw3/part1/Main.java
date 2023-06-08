package homeworks.hw3.part1;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Printable printableBook = new Book(454, "clean code");
//        printableBook.print();
//        printableBook.print();


//        Printable[] printables = new Printable[4];
//        Printable[] printables = {new Book(123, "asdasd"), new Magazine("123123", "blush", 12)};

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(new Magazine("asda", "ajsdgjdg", 12312));
        printables.add(new Book(123, "ajsdgjdg"));

        for (Printable printable : printables) {
            printable.print();
        }


    }
}

//        а) Определить интерфейс Printable, содержащий метод void print().
interface Printable {
    void print();
}

//                б) Определить класс Book, реализующий интерфейс Printable.
@AllArgsConstructor
@Data
class Book implements Printable {
    private int pagesCounter;
    private String title;

    @Override
    public void print() {
        System.out.println("print book " + this.title + " volume - " + this.pagesCounter + " pages");
    }
}

//        в) Определить класс Magazine, реализующий интерфейс Printable.

@Data
@AllArgsConstructor
class Magazine implements Printable {

    private String title;
    private String type;
    private int pagesCount;

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}
//        г) Создать массив типа Printable, который будет содержать книги и журналы.
