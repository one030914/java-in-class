import java.util.Scanner;

public class ex04{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("m: ");
        double m = scanner.nextDouble();
        System.out.printf("kg: ");
        double kg = scanner.nextDouble(), bmi;
        bmi = kg / Math.pow(m, 2);
        System.out.format("BMI: %.2f\nBody position division: ", bmi);
        if (bmi < 18.5)
            System.out.println("underweight");
        else if (24.9 < bmi && bmi <= 18.5)
            System.out.println("normal range");
        else if (29.9 < bmi && bmi <= 24.9)
            System.out.println("overweight");
        else if (bmi >= 29.9)
            System.out.println("obesity");
    }
}