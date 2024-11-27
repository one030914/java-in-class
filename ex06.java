import java.util.Scanner;

public class ex06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter account: ");
        String acc = scanner.next();

        System.out.printf("Enter balance: ");
        double balance = scanner.nextDouble();

        BankAccount account = new BankAccount(acc, balance);

        System.out.printf("Account: %s\nInitial Balance: %.2f\n", account.account, account.balance);
        System.out.printf("Enter amout to deposit: ");
        double add = scanner.nextInt();
        account.deposit(add);
        
        System.out.printf("Enter amout to withdraw: ");
        double sub = scanner.nextInt();
        account.withdraw(sub);
    }
}

class BankAccount{
    String account = "";
    double balance = 0.0;
    public BankAccount(String account, double balance){
        this.account = account;
        this.balance = balance;
    }
    public void deposit(double add){
        System.out.printf("%s: Depositing %.2f...\n", this.account, add);
        this.balance += add;
        this.displayBalance();
    }
    public void withdraw(double sub){
        if (sub > this.balance) {
            System.out.printf("%s: Insufficient balance for withdrawal.\n", this.account);
        }else{
            System.out.printf("%s: Withdrawing %.2f...\n", this.account, sub);
            this.balance -= sub;
            this.displayBalance();
        }
    }
    public void displayBalance(){
        System.out.printf("%s: Balance after transaction: %.2f\n", this.account, this.balance);
    }
}