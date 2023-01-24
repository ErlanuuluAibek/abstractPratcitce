public class Bus extends Car {
    private Salesman salesman;
    private BusDriver busDriver;
    public Bus() {
    }

    public Bus(String id, String color, int productionYear, int number,Salesman salesman,BusDriver busDriver) {
        super(id, color, productionYear, number);
        this.salesman=salesman;
        this.busDriver=busDriver;
    }

    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    @Override
    public void stops() {
        System.out.println("Bus is stop");
    }

    @Override
    public String toString() {
        return "Bus{ " + getId() + '\'' +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", number=" + getNumber()+" personal "+ salesman+" "+busDriver;

    }
}
