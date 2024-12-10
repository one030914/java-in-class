import java.util.Scanner;

public class ex24{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 100;
        Device[] devices = new Device[SIZE];
        Device device;
        Computer computer;
        Laptop laptop;
        String cmd = "", gadget = "", brand = "", processor = "", state = "";
        int priority = 0, index = 0, battery = 0;

        while(scanner.hasNext()){
            cmd = scanner.next().toLowerCase();
            switch (cmd){
                case "append":
                    gadget = scanner.next().toLowerCase();
                    switch (gadget){
                        case "device":
                            brand = scanner.next();
                            device = new Device(brand);
                            devices[priority++] = device;
                            break;
                        case "computer":
                            brand = scanner.next();
                            processor = scanner.next();
                            computer = new Computer(brand, processor);
                            devices[priority++] = computer;
                            break;
                        case "laptop":
                            brand = scanner.next();
                            processor = scanner.next();
                            battery = scanner.nextInt();
                            laptop = new Laptop(brand, processor, battery);
                            devices[priority++] = laptop;
                            break;
                        default:
                            System.out.println("Invalid gadget.");
                            continue;
                    }
                    break;
                case "update":
                    index = scanner.nextInt();
                    state = scanner.next();
                    devices[index].changeState(state);
                    break;
                default:
                    System.out.println("Invalid command.");
                    continue;
            }
            for(int i = 0; i < priority; i++) {
                System.out.println(devices[i].toString());
            }
            System.out.println();
        }         
    }
}

class Device{
    private String brand = "";
    private enum State{
        ON, OFF, STANDBY
    }
    private State state;
    public Device(String brand){
        this.brand = brand;
        this.state = State.OFF;
    }
    public void changeState(State newState){
        this.state = newState;
    }
    public void changeState(String state){
        try{
            this.state = State.valueOf(state.toUpperCase());
        } catch(IllegalArgumentException e){
            System.out.println("Invlid state.");
        }
    }
    public String getBrand(){
        return this.brand;
    }
    public State getState(){
        return this.state;
    }
    public String toString(){
        return String.format("Device(Brand: %s, State: %s)", getBrand(), getState());
    }
}

class Computer extends Device{
    private String processor = "";
    public Computer(String brand, String processor){
        super(brand);
        this.processor = processor;
    }
    public String getProcessor(){
        return this.processor;
    }
    @Override
    public String toString(){
        return String.format("Computer(Brand: %s, Processor: %s, State: %s)", getBrand(), getProcessor(), getState());
    }
}

class Laptop extends Computer{
    private int batteryCapacity = 0;
    public Laptop(String brand, String processor, int batteryCapacity){
        super(brand, processor);
        this.batteryCapacity = batteryCapacity;
    }
    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }
    @Override
    public String toString(){
        return String.format("Laptop(Brand: %s, Processor: %s, Battery Capacity: %d Ah, State: %s)", getBrand(), getProcessor(), getBatteryCapacity(), getState());
    }
}