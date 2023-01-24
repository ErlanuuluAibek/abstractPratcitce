public class Trolleibus extends  Car{
    public Salesman salesman;
    public Trolleibus() {
    }

    public Trolleibus(String id, String color, int productionYear, int number,Salesman salesman) {
        super(id, color, productionYear, number);
        this.salesman=salesman;
    }

    @Override
    public void run() {
        System.out.println("trolleibus is running");
    }

    @Override
    public void stops() {
        System.out.println("trolleibus is stop");
    }

    @Override
    public String toString() {
        return "Trolleibus: "+ getId() + '\'' +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", number=" + getNumber()+" personal " +salesman;
    }
}
