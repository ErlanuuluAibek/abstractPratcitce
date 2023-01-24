public class BusDriver extends Person {
    public BusDriver() {
    }

    public BusDriver(String name, String working, int age) {
        super(name, working, age);
    }

    @Override
    public String toString() {
        return "BusDriver { name: " + getName() + '\'' +
                ", working='" + getWorking() + '\'' +
                ", age=" + getAge() +
                "}";
    }
}
