import java.util.Scanner;

public class ex20{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int start = 0, end = 0, interval = 0, a = 0, b = 0, c = 0, d = 0;
        double function = 0.0, mask = 0.0, product = 0.0, sum = 0;

        System.out.printf("Enter start, end, interval value: ");
        start = scanner.nextInt();
        end = scanner.nextInt();
        interval = scanner.nextInt();

        System.out.printf("Enter parameters a, b, c, d: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        for(int i = 0; i <= end; i += interval){
            System.out.println("Iteration " + i + ":");
            System.out.printf("\t i = %d\n", i);
            function = function(i, a, b);
            mask = mask(i, c, d);
            product = product(function, mask, interval);
            System.out.printf("\tfunction(%.2f, %.2f, %.2f) = %.2f\n", (double)i, (double)a, (double)b, function);
            System.out.printf("\tmask(%.2f, %.2f, %.2f) = %.2f\n", (double)i, (double)c, (double)d, mask);
            System.out.printf("\tProduct: %.2f\n\n", product);
            sum += product;
        }
        System.out.printf("Sum of all products: %.2f", sum);
    }
    public static double function(int i, int a, int b){
        return a * Math.sin(i) + b * Math.cos(i);
    }
    public static double mask(int i, int c, int d){
        return c * Math.sin(i) + d * Math.cos(i);
    }
    public static double product(double function, double mask, int interval){
        return function * mask * interval;
    }
}