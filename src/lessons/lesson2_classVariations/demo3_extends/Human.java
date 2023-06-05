package lessons.lesson2_classVariations.demo3_extends;

public class Human {
    private String name;
    private String surname;

    public Human() {
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human human)) return false;

        if (getName() != null ? !getName().equals(human.getName()) : human.getName() != null) return false;
        return getSurname() != null ? getSurname().equals(human.getSurname()) : human.getSurname() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }


    public final void greeting() {
        System.out.println("hello");
    }
}
