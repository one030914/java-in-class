import java.util.Scanner;
import java.security.SecureRandom;

public class ex13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        int n = 0;
        double sum = 0.0, max = -Double.MAX_VALUE, x1 = 0.0, x2 = 0.0;
        System.out.printf("Enter number of random generations (times): ");
        n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            x1 = -2 + rand.nextDouble(2);
            x2 = -2 + rand.nextDouble(2);
            sum = shubert(x1, x2);
            System.out.printf("Iteration %d:\n", i + 1);
            System.out.printf("Current Solution: shuberFuncion(x1 = %7.4f, x2 = %7.4f) = %7.4f\n", x1, x2, sum);
            if(max < sum){
                max = sum;
            }
            System.out.printf("Maximun Solution: shuberFuncion(x1 = %7.4f, x2 = %7.4f) = %7.4f\n", x1, x2, max);
        }

    }
    static double shubert(double x1, double x2){
        double y1 = 0.0, y2 = 0.0;
        for(int i = 1; i <= 5; i++){
            y1 += (i * Math.cos((i + 1) * x1 + i));
            y2 += (i * Math.cos((i + 1) * x2 + i));
        }
        return y1 * y2;
    }
}