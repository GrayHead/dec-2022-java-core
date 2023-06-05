package lessons.lesson2_classVariations.demo2_enum;

public enum Gender {
    MALE(true), FEMALE(false);
    private boolean pipka;

    public boolean isPipka() {
        return pipka;
    }

    public void setPipka(boolean pipka) {
        this.pipka = pipka;
    }

    private Gender() {
    }

    Gender(boolean pipka) {
        this.pipka = pipka;
    }
}
