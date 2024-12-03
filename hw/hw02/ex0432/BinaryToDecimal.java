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
 * 此程式目的為把二進位轉成十進位。
 * **************************************************************/

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a binary number: ");
        int input = scanner.nextInt();
        int output = B2D(input);
        System.out.printf("The decimal equivalent is: %d\n", output);
    }
    public static int B2D(int input){
        int digit = 0, n = 0, decimal = 0;
        while(input != 0){
            digit = input % 10;
            input /= 10;
            decimal += digit * Multiply(n);
            n++;
        }
        return decimal;
    }
    public static int Multiply(int input){
        int n = 2;
        if (input == 0){
            return 1;
        }else if (input == 1){
            return 2;
        }else{
            for (int i = input; i > 1; i--){
                n *= 2;
            }
            return n;
        }
    }
}