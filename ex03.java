import java.util.Scanner;

public class ex03{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("F: ");
        double f = scanner.nextDouble();
        System.out.format("C: %.2f\nK: %.2f", (f - 32) * 5 / 9, (f + 459.67) * 5 / 9);
    }
}