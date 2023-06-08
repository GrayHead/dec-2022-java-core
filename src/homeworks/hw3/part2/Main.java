package homeworks.hw3.part2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Instrument> instrumentList = new ArrayList<>();
        instrumentList.add(new Guitar());
        instrumentList.add(new Drums());
        instrumentList.add(new Trumpet());

        for (Instrument instrument : instrumentList) {
            instrument.play();
        }
    }
}

interface Instrument {
    void play();
}

class Guitar implements Instrument {
    private int stringsCounter;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play with " + this.toString());


    }
}

class Drums implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play with " + this.toString());


    }
}

class Trumpet implements Instrument {
    private int di;

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " play with " + this.toString());


    }
}
