package lessons.lesson2_classVariations.demo4_abstract;

public class Bird extends Animal {

    private int wings;

    public Bird() {
    }

    public Bird(boolean brain, int eyes, int wings) {
        super(brain, eyes);
        this.wings = wings;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        if (!super.equals(o)) return false;

        return getWings() == bird.getWings();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getWings();
        return result;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wings=" + wings +
                "} " + super.toString();
    }

    @Override
    public void doSound() {
        System.out.println("chik chirik");
    }
}
