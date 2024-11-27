import java.util.Scanner;

public class ex09{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String mode = "", n1 = "", n2 = "";
        boolean x1 = false, x2 = false, x3 = false;
        while(true){
            System.out.printf("Choose logic gate(AND, OR, XOR, EXIT): ");
            mode = scanner.nextLine();
            if(mode.equals("EXIT")){
                System.out.printf("Exiting the system...");
                break;
            }
            System.out.printf("Enter first boolean (true/false): ");
            n1 = scanner.nextLine();
            System.out.printf("Enter second boolean (true/false): ");
            n2 = scanner.nextLine();

            if(n1.equals("true")){
                x1 = true;
            }else if(n1.equals("false")){
                x1 = false;
            }

            if(n2.equals("true")){
                x2 = true;
            }else if(n2.equals("false")){
                x2 = false;
            }
            
            switch (mode){
                case "AND":
                    x3 = andGate(x1, x2);
                    System.out.printf("AND Gate Result: %b\n\n", x3);
                    continue;
                case "OR":
                    x3 = orGate(x1, x2);
                    System.out.printf("OR Gate Result: %b\n\n", x3);
                    continue;
                case "XOR":
                    x3 = xorGate(x1, x2);
                    System.out.printf("XOR Gate Result: %b\n\n", x3);
                    continue;
            }
            break;
        }
    }
    public static boolean andGate(boolean x1, boolean x2){
        return x1 & x2;
    }
    public static boolean orGate(boolean x1, boolean x2){
        return x1 | x2;
    }
    public static boolean xorGate(boolean x1, boolean x2){
        return x1 ^ x2;
    }
}