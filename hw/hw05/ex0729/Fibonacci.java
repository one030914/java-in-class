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
 * 此程式目的為解決三個題目：(a)使用者輸入一個整數，列印出第n個費氏數列。(b)列印出最大項的費氏數列。(c)結合前兩個題目，但類型為浮點數。
 * **************************************************************/


import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("(a) Enter a int number: ");
        int n = scanner.nextInt();
        for(int i = 0; i <= n; i++){
            if(i > 0){
                System.out.print(" ");
            }
            System.out.printf("%d", recurFib(i));
        }

        System.out.println("\n(b) The largest(n=92) int fibonacci sequence: ");
        int largest = 92;
        for(int i = 0; i <= largest; i++){
            if(i > 0){
                System.out.print(" ");
            }
            System.out.printf("%d", forFib(i));
        }

        System.out.println("\n(c1) The floating fibonacci sequence");
        System.out.print("Enter first float number: ");
        double m1 = scanner.nextDouble();
        System.out.print("Enter second float number: ");
        double m2 = scanner.nextDouble();
        System.out.print("Enter the nth number: ");
        int m = scanner.nextInt();
        for(int i = 0; i <= m; i++){
            if(i > 0){
                System.out.print(" ");
            }
            System.out.printf("%.4f", forFib(m1, m2, i));
        }

        System.out.println("\n(c2) The largest(n1 = 0.5, n2 = 0.7, n = 92) floating fibonacci sequence");
        for(int i = 0; i <= largest; i++){
            if(i > 0){
                System.out.print(" ");
            }
            System.out.printf("%.4f", forFib(0.5, 0.7, i));
        }
    }
    public static long recurFib(int n){
        if(n <= 1){
            return n;
        }
        return recurFib(n - 1) + recurFib(n - 2);
    }
    public static long forFib(int n){
        if(n <= 1){
            return n;
        }
        long first = 0, second = 1, result = 0;
        for(int i = 2; i <= n; i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
    public static double recurFib(double n1, double n2, double n){
        if(n == 0){
            return n1;
        }else if(n == 1){
            return n2;
        }
        return recurFib(n1, n2, n - 1) + recurFib(n1, n2, n - 2);
    }
    public static double forFib(double n1, double n2, double n){
        if(n == 0){
            return n1;
        }else if(n == 1){
            return n2;
        }
        double first = n1, second = n2, result = 0.0;
        for(int i = 2; i <= n; i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}