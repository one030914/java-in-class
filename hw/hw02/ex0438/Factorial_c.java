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
 * 此程式目的為計算e^x = 1 + x/1! + x^2/2! + ... + x^n/n!。
 * **************************************************************/

import java.util.Scanner;

public class Factorial_c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of n to estimate e: ");
        int n = scanner.nextInt();
        System.out.printf("Enter the number of x to estimate e: ");
        double x = scanner.nextDouble();
        double e = 1.0;
        e = compute(n, x);
        System.out.printf("Estimated value of e: %.4f\n", e);
    }
    public static double compute(int n, double x){
        double sum = 1.0, factorial = 1.0, pow = 1.0;
        for (int i = 1; i <= n; i++){
            pow *= x;
            factorial *= i;
            sum += pow / factorial;
        }
        return sum;
    }
}