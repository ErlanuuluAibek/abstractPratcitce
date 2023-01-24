public class Machine extends Car {
    private Cabdriver cabdriver;
    private BusDriver busDriver;
    public Machine() {
    }

    public Machine(String id, String color, int productionYear, int number,Cabdriver cabdriver,BusDriver busDriver) {
        super(id, color, productionYear, number);
        this.cabdriver=cabdriver;
        this.busDriver=busDriver;
    }

    @Override
    public void run() {
        System.out.println("Machine is running");
    }

    @Override
    public void stops() {
        System.out.println("Machine is stop");
    }

    @Override
    public String toString() {
        return "Machine: " + getId() + '\'' +
                ", color='" + getColor() + '\'' +
                ", productionYear=" + getProductionYear() +
                ", number=" + getNumber()+" personal "+cabdriver+" "+busDriver;
    }
}
