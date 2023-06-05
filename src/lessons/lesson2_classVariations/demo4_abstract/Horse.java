package lessons.lesson2_classVariations.demo4_abstract;

public class Horse extends Animal {

    private int legs;
    private int speed;

    public Horse() {
    }

    public Horse(boolean brain, int eyes, int legs, int speed) {
        super(brain, eyes);
        this.legs = legs;
        this.speed = speed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse horse)) return false;
        if (!super.equals(o)) return false;

        if (getLegs() != horse.getLegs()) return false;
        return getSpeed() == horse.getSpeed();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getLegs();
        result = 31 * result + getSpeed();
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "legs=" + legs +
                ", speed=" + speed +
                "} " + super.toString();
    }

    @Override
    public void doSound() {
        System.out.println("frrrrrrrrrrrr");
    }
}
