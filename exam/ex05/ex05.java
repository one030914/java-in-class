import java.util.Scanner;

public class ex05{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the radius of the circle: ");
        int r = scanner.nextInt();
        double pi = 3.14;
        System.out.printf("The area is: %.2f\n", Math.pow(r, 2) * pi);
        System.out.printf("The circumference is: %.2f", 2 * pi * r);
    }
}