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
 * 此程式目的為讓使用者輸入10個10~100之間的數，判斷是否有重複，並列印出結果。
 * **************************************************************/

import java.util.Scanner;

public class Set{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        int[] arr = new int[SIZE];
        int n = 0, input = 0;
        for(int i = 0; i < SIZE; i++){
            arr[i] = -1;
        }

        System.out.println("Enter 10 numbers between 10 and 100.");
        while(n < SIZE){
            input = scanner.nextInt();
            if(input >= 10 && input <= 100){
                if(!isDuplicate(arr, input)){
                    arr[n] = input;
                }
            }else{
                System.out.println("Invalid input. Enter the number again.");
                n--;
            }
            n++;
        }

        for(int i : arr){
            if(i != -1){
                System.out.printf("%d ", i);
            }
        }
    }
    public static boolean isDuplicate(int[] arr, int input){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == input){
                return true;
            }
        }
        return false;
    }
}