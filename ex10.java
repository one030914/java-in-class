import java.util.Scanner;

public class ex10{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double E_elec = 0.0, E_amp = 0.0, Energy = 0.0, distance = 0.0;
        int size = 0;
        String mode = "";
        System.out.printf("Enter E_elec: ");
        E_elec = scanner.nextDouble();
        System.out.printf("Enter E_amp: ");
        E_amp = scanner.nextDouble();
        System.out.printf("Enter initial energy: ");
        Energy = scanner.nextDouble();
        FirstOrderRadioDevice divice = new FirstOrderRadioDevice(E_elec, E_amp, Energy);

        while(true){
            scanner.nextLine();
            System.out.printf("Choose operation: trasmit or receive: ");
            mode = scanner.nextLine();
            System.out.printf("Enter message size (in bits): ");
            size = scanner.nextInt();
            if(mode.equals("transmit")){
                System.out.printf("Enter transmission distance: ");
                distance = scanner.nextDouble();
                divice.transmit(size, distance);
            }else if(mode.equals("receive")){
                divice.receive(size);
            }else{
                continue;
            }
            if(divice.remainingEnergy() <= 0){
                break;
            }
        }
    }
}

class FirstOrderRadioDevice{
    double E_elec = 0.0, E_amp = 0.0, Energy = 0.0, E_con = 0.0;

    public FirstOrderRadioDevice(double E_elec, double E_amp, double Energy){
        this.E_elec = E_elec;
        this.E_amp = E_amp;
        this.Energy = Energy;
    }
    public double remainingEnergy(){
        return Energy;
    }
    public void transmit(int size, double distance){
        E_con = E_elec * size + E_amp * size * Math.pow(distance, 2);
        Energy -= E_con;
        System.out.printf("Energy consumed: %.2f. Remaining energy %.2f\n\n", E_con, Energy);
        if(Energy <= 0.0){
            System.out.printf("Device has run out of energy. Shutting down...\n");
        }
    }
    public void receive(int size){
        E_con = E_elec * size;
        Energy -= E_con;
        System.out.printf("Energy consumed: %.2f. Remaining energy %.2f\n\n", E_con, Energy);
        if(Energy <= 0.0){
            System.out.printf("Device has run out of energy. Shutting down...\n");
        }
    }
}