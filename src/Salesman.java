public class Salesman extends Person {
    public Salesman() {
    }

    public Salesman(String name, String working, int age) {
        super(name, working, age);
    }


    @Override
    public String toString() {
        return "Salesman{" + " name " + getName() + '\'' +
                ", working='" + getWorking() + '\'' +
                ", age=" + getAge() +
                '}';
    }
}
