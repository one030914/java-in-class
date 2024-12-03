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
 * 此程式目的為創建 Clock 的類別及相關屬性與方法。
 * **************************************************************/

public class Clock {
    int hour = 0, minute = 0, second = 0;
    public Clock(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23 && 0 <= minute && minute <= 59 && 0 <= second && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else{
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }
    public void set(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23 && 0 <= minute && minute <= 59 && 0 <= second && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }else{
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    public void diplayTime() {
        System.out.printf("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
