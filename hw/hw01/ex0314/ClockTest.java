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
 * 此程式目的為測試 Clock 的類別及相關屬性與方法之程式。
 * **************************************************************/

import java.util.Scanner;

public class ClockTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock(0, 0, 0);

        System.out.printf("Enter the hour: ");
        int hour = scanner.nextInt();
        System.out.printf("Enter the minute: ");
        int minute = scanner.nextInt();
        System.out.printf("Enter the second: ");
        int second = scanner.nextInt();
        scanner.close();
        clock.set(hour, minute, second);

        System.out.printf("Hour: %d, Minute: %d, Second: %d\n", clock.getHour(), clock.getMinute(), clock.getSecond());
        clock.diplayTime();
    }
}
