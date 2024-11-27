import java.util.Scanner;

public class ex08{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int target = 0, guess = 0, c = 0, temp = 0;

        System.out.printf("Enter a number between 1 and 100 for the target answer: ");
        target = scanner.nextInt();
        System.out.printf("Set the number of attempts: ");
        c = scanner.nextInt();
        temp = c;

        for (int i = 0; i < c; i++){
            System.out.printf("Attempt %d: Enter your guess: ", i);
            guess = scanner.nextInt();
            if(guess > target){
                temp -= 1;
                System.out.printf("Too high!Attempts remaining: %d\n", temp);
            }else if(guess == target){
                System.out.printf("Congratulations! You guessed the correct number!\n");
                break;
            }else if(guess < target){
                temp -= 1;
                System.out.printf("Too low!Attempts remaining: %d\n", temp);
            }
            if(temp == 0){
                System.out.printf("Sorry, you've run out of attempts. The correct number was %d.\n", target);
            }
        }
    }
}