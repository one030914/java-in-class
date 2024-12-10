import java.util.Scanner;

public class AirConditioning{
    private enum Mode{
        SHUTDOWN, DEHUMIDIFICATION, REFRIGERATION
    }
    private Mode mode;
    private int tmp = 0, env = 0;
    public AirConditioning(Mode mode, int tmp, int env){
        this.mode = mode;
        this.tmp = tmp;
        this.env = env;
    }
    public void changeMode(Mode mode){
        this.mode = mode;
    }
    public void changeTemperature(int tmp){
        this.tmp = tmp;
    }
    public void changeEnv(int env){
        this.env = env;
    }
    public boolean operate(){
        if(this.env > this.tmp){
            this.mode = Mode.REFRIGERATION;
            return true;
        }
        switch (this.mode){
            case DEHUMIDIFICATION:
                this.mode = Mode.DEHUMIDIFICATION;
                return true;
            case REFRIGERATION:
                this.mode = Mode.REFRIGERATION;
                break;
            case SHUTDOWN:
                this.mode = Mode.SHUTDOWN;
                break;
        }
        return false;
    }
    public String toString(){
        return (" air conditioning status:\n  AirConditioning(Mode: " + this.mode + ", Temperature: " + this.tmp + "),\n  Enviroment Temperature: " + this.env + ", Air conditioning is operating: " + operate());
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        AirConditioning.Mode mode;
        String input = "";
        int tmp = 0, env = 0;

        System.out.printf("Enter initial mode (Shutdown, Dehumidification, Refrigeration): ");
        input = scanner.next();
        try{
            mode = AirConditioning.Mode.valueOf(input.toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid mode. Defaulting to SHUTDOWN.");
            mode = AirConditioning.Mode.SHUTDOWN;
        }
        System.out.printf("Enter initial temperature (17~30): ");
        tmp = scanner.nextInt();
        System.out.printf("Enter initial enviroment temperature (0~100): ");
        env = scanner.nextInt();
        AirConditioning AC = new AirConditioning(mode, tmp, env);
        System.out.println("Initial" + AC.toString() + "\n");

        while(scanner.hasNext()){
            String cmd = scanner.next().toLowerCase();
            switch (cmd){
                case "chmod":
                    input = scanner.next();
                    AC.changeMode(AirConditioning.Mode.valueOf(input.toUpperCase()));
                    break;
                case "chtmp":
                    tmp = scanner.nextInt();
                    AC.changeTemperature(tmp);
                    break;
                case "chenv":
                    env = scanner.nextInt();
                    AC.changeEnv(env);
                    break;
                default:
                    System.out.println("Invalid command.");
                    continue;
            }
            System.out.println("Updated" + AC.toString());
        }
    }
}