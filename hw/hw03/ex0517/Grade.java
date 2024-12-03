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
 * 此程式目的為計數五個學生五個成績的A、B、C、D各有多少人。
 * **************************************************************/

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        for(int i = 0; i < 5; i++){
            System.out.printf("Enter name of student %d: ", i + 1);
            String name = scanner.next();
            System.out.printf("Enter score of student %d: ", i + 1);
            char score = scanner.next().charAt(0);

            switch(score){
                case 'a':
                case 'A':
                    a++;
                    break;
                case 'b':
                case 'B':
                    b++;
                    break;
                case 'c':
                case 'C':
                    c++;
                    break;
                case 'd':
                case 'D':
                    d++;
                    break;
            }
        }
        System.out.printf("Number of students who have grade A: %d\n", a);
        System.out.printf("Number of students who have grade B: %d\n", b);
        System.out.printf("Number of students who have grade C: %d\n", c);
        System.out.printf("Number of students who have grade D: %d\n", d);
    }
}
