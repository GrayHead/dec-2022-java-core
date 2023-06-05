package lessons.lesson2_classVariations.demo4_abstract;


public abstract class Animal {
    private boolean brain;
    private int eyes;

    public Animal() {
    }

    public Animal(boolean brain, int eyes) {
        this.brain = brain;
        this.eyes = eyes;
    }

    public boolean isBrain() {
        return brain;
    }

    public void setBrain(boolean brain) {
        this.brain = brain;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;

        if (isBrain() != animal.isBrain()) return false;
        return getEyes() == animal.getEyes();
    }

    @Override
    public int hashCode() {
        int result = (isBrain() ? 1 : 0);
        result = 31 * result + getEyes();
        return result;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "brain=" + brain +
                ", eyes=" + eyes +
                '}';
    }

    public abstract void doSound();
}
