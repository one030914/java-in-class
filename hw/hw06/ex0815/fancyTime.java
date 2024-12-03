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
 * 此程式目的為設計顯示三種不同模式的時間，1. HH:MM:SS a.m. / p.m.(12小時制) 2. HH:MM:SS(24小時制) 3. HH:MM(24小時制)，且只用旗標控制顯示模式。
 * **************************************************************/

public class fancyTime{
    private int hour, minute, second;

    public fancyTime(int hour, int minute, int second){
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Invalid hour");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("Invalid minute");
        }
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("Invalid second");
        }
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public fancyTime(int hour, int minute, int second, String meridian){
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Invalid hour");
        }
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("Invalid minute");
        }
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("Invalid second");
        }
        if(!meridian.equalsIgnoreCase("a.m.") && !meridian.equalsIgnoreCase("p.m.")){
            throw new IllegalArgumentException("Invalid meridian");
        }
        
        this.hour = (meridian.equalsIgnoreCase("p.m.") && hour != 12) ? hour + 12 : hour % 12;
        this.minute = minute;
        this.second = second;
    }
    public fancyTime(int hour, int minute){
        this(hour, minute, 0);
    }
    public void displayTime(int n){
        switch (n){
            case 1:
                String meridian = (this.hour < 12) ? "a.m." : "p.m.";
                int Hour = (this.hour % 12 == 0) ? 12 : this.hour % 12;
                System.out.printf("%02d:%02d:%02d %s\n", Hour, this.minute, this.second, meridian);
                break;
            case 2:
                System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
                break;
            case 3:
                System.out.printf("%02d:%02d\n", this.hour, this.minute);
                break;
        }
    }
    public static void main(String[] args){
        fancyTime t1 = new fancyTime(10, 25, 45, "a.m.");
        fancyTime t2 = new fancyTime(14, 30, 00);
        fancyTime t3 = new fancyTime(20, 59);

        t1.displayTime(1);
        t1.displayTime(2);
        t1.displayTime(3);
        System.out.println();
        
        t2.displayTime(1);
        t2.displayTime(2);
        t2.displayTime(3);
        System.out.println();
        
        t3.displayTime(1);
        t3.displayTime(2);
        t3.displayTime(3);
    }
}