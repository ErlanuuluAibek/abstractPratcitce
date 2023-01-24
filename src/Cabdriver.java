public class Cabdriver extends Person {
    public Cabdriver() {
    }

    public Cabdriver(String name, String working, int age) {
        super(name, working, age);
    }

    @Override
    public String toString() {
        return "Cabdriver{" + " name: " + getName() + '\'' +
                ", working='" + getWorking() + '\'' +
                ", age=" + getAge() +
                "}";
    }
}
