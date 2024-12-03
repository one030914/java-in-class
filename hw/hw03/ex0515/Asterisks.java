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
 * 此程式目的為運用'*'排版a、b、c、d的樣式。
 * **************************************************************/

import java.util.Scanner;

public class Asterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // only uses:
        // System.out.print('*');
        // System.out.println();
        // System.out.print(' ');
        System.out.println("(a): ");
        a_pattern();
        System.out.println("(b): ");
        b_pattern();
        System.out.println("(c): ");
        c_pattern();
        System.out.println("(d): ");
        d_pattern();
    }
    public static void a_pattern(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void b_pattern(){
        for(int i = 10; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void c_pattern(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j <= 10 - i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void d_pattern(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10 - i; j++){
                System.out.print(' ');
            }
            for(int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}