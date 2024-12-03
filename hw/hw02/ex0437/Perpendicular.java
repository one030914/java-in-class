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
 * 此程式目的為求兩點是否垂直於座標軸上。
 * **************************************************************/

import java.util.Scanner;

public class Perpendicular{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter first point (x1, y1): ");
        int x1 = scanner.nextInt(), y1 = scanner.nextInt();
        System.out.printf("Enter second point (x2, y2): ");
        int x2 = scanner.nextInt(), y2 = scanner.nextInt();

        if (x1 == x2){
            System.out.printf("(%d,%d) and (%d,%d) are located on a line perpendicular to the X-axis.\n", x1, y1, x2, y2);
        }else if(y1 == y2){
            System.out.printf("(%d,%d) and (%d,%d) are located on a line perpendicular to the Y-axis.\n", x1, y1, x2, y2);
        }else{
            System.out.printf("(%d,%d) and (%d,%d) are not located on a line perpendicular to the any axis\n", x1, y1, x2, y2);
        }
    }
}