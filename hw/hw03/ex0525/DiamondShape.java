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
 * 此程式目的為在1到19之間輸入一個奇數，輸出鑽石形狀。
 * **************************************************************/

import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while(n < 1 || n > 19 || n % 2 == 0){
            System.out.printf("Enter an odd number between 1 and 19: ");
            n = scanner.nextInt();
        }
        int mid = n / 2;
        for(int i = 0; i <= mid; i++){
            for(int j = 0; j < mid - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = mid - 1; i >= 0; i--){
            for(int j = 0; j < mid - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}