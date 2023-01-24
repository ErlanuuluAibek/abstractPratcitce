public abstract class Person {
    private String name;
    private String working;
    private int age;

    public Person() {
    }

    public Person(String name, String working, int age) {
        this.name = name;
        this.working = working;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorking() {
        return working;
    }

    public void setWorking(String working) {
        this.working = working;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", working='" + working + '\'' +
                ", age=" + age +
                '}';
    }
}
