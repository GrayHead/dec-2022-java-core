package lessons.lesson2_classVariations.demo4_abstract;

public class Main {
    public static void main(String[] args) {

        Horse horse = new Horse();
        Bird bird = new Bird();

        Animal[] animals = {horse, bird};


        Animal animal = new Animal(){
            @Override
            public void doSound() {

            }
        };
        animal.doSound();


    }
}
