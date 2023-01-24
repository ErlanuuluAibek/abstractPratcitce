public class Main {
    public static void main(String[] args) {
        Salesman salesman=new Salesman("Deku","salesman",17);
        Trolleibus trolleibus=new Trolleibus("id06","black",1999,9387,salesman);
        System.out.println(trolleibus);
        Salesman salesman1=new Salesman("Bakugo","salesman",18);
        BusDriver busDriver=new BusDriver("Iida","bust Driver",19);
        Bus bus=new Bus("id08","white",2002,6789,salesman1,busDriver);
        System.out.println(bus);
        BusDriver busDriver1=new BusDriver("Tetsu","bust Driver",19);
        Cabdriver cabdriver=new Cabdriver("Shota","cab driver",19);
        Machine machine=new Machine("id0907","black",2004,706,cabdriver,busDriver1);
        System.out.println(machine);
    }
}