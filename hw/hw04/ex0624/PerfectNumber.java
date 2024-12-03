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
 * 此程式目的為數字是否為完美數(1到使用者輸入的數)。
 * **************************************************************/

import java.util.Scanner;

public class PerfectNumber{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a limit number: ");
        long number = scanner.nextInt();
        for (int i = 1; i <= number; i++){
            boolean isPerfect = isPerfect(i);
        }
    }
    static boolean isPerfect(long n){
        long i = 1, sum = 0;
        String output = "";
        for(; i < n; i++){
            if(n % i == 0){
                output += i + " + ";
                sum += i;
            }
        }
        if(sum == n){
            output = output.substring(0, output.length() - 3);
            System.out.printf("%d is a perfect number, the factor is: %s\n", n, output);
            return true;
        }else{
            return false;
        }
    }
}