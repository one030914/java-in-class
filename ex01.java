import java.util.Scanner;

public class ex01{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int temp = 1;
        for (int i = 1;i < num+1;i++){
            temp *= i;
        }
       System.out.print(temp);
    }
}