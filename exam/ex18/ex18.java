import java.util.Scanner;

public class ex18{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        int sum = 0;
        double avg = 0.0, ssd = 0.0;
        for(int i = 0; i < SIZE; i++){
            arr[i] = scanner.nextInt();
            sum += arr[i];
            avg = (double) sum / (i + 1);
        }
        for(int i = 0; i < SIZE; i++){
            ssd += Math.pow(arr[i] - avg, 2);
        }
        System.out.printf("Average: %.1f\nSum of Squared of Deviation: %.2f\n", avg, ssd);
    }
}