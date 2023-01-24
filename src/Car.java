public abstract class Car {
    private String id;
    private String color;
    private int productionYear;
    private int number;

    public Car() {
    }

    public Car(String id, String color, int productionYear, int number) {
        this.id = id;
        this.color = color;
        this.productionYear = productionYear;
        this.number = number;
    }
    public abstract void run();
    public abstract void stops();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", number=" + number +
                '}';
    }
}
