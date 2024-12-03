/****************************************************************
 * Copyright (c) 2024 劉祐伸
 * 
 * 此程式及其文件的版權歸 劉祐伸 所有。
 * 
 * 本程式碼僅用於學術或個人學習用途，不得用於商業目的或未經授權的分發。
 * 如果需要使用本程式碼，請事先聯繫版權持有者以獲得授權。
 * 
 * 本程式基於以下開源資源/工具：Visual Studio Code & Java
 * 
 * 本程式在「現狀」基礎上提供，沒有任何明示或暗示的擔保，包括但不限於針對特定用途的適用性和無侵權性。
 * 在任何情況下，版權擁有人均不對由於使用本程式而引起的任何索賠、損害或其他責任負責。
 *  
 * 此程式目的為測試 Account 類別的相關屬性與方法之程式。
 * **************************************************************/

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);
        
        // account1
        // add
        System.out.print("Enter deposit amout for account1: ");
        double depositAmout = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmout);
        account1.deposit(depositAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
        // sub
        System.out.print("Enter withdraw amout for account1: ");
        double withdrawAmout = input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n", withdrawAmout);
        account1.withdraw(withdrawAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        // account2
        // add
        System.out.printf("Enter deposit amout for account2: ");
        depositAmout = input.nextDouble();

        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmout);
        account2.deposit(depositAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());
        // sub
        System.out.print("Enter withdraw amout for account2: ");
        withdrawAmout = input.nextDouble();
        System.out.printf("%nsubtracting %.2f to account1 balance%n%n", withdrawAmout);
        account2.withdraw(withdrawAmout);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n", account2.getName(), account2.getBalance());

        input.close();
    }
}
