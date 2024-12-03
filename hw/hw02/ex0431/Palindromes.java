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
 * 此程式目的為檢查使用者輸入的五位數字是否為迴文，且判斷是否為五位數字。
 * **************************************************************/

import java.util.Scanner;

public class Palindromes{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a five-digit number: ");
        int input = scanner.nextInt();
        while (true){
            String result = fiveDigit(input);
            if (result == "error"){
                System.out.printf("Invalid input. Please enter a five-digit number: ");
                input = scanner.nextInt();
                result = fiveDigit(input);
            }else if(result == "yes"){
                System.out.println("It's a Palindrome.");
                break;
            }else if(result == "no"){
                System.out.println("It's not a Palindrome.");
                break;
            }
        }
    }
    public static String fiveDigit(int input){
        int digit = 0, reverse = 0, original = input, c = 0;
        while(input != 0){
            digit = input % 10;
            reverse = reverse * 10 + digit;
            input /= 10;
            c++;
        }
        if(c != 5){
            return "error";
        }
        if(reverse == original){
            return "yes";
        }else {
            return "no";
        }
    }
}