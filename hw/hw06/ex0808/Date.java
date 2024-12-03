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
 * 此程式目的為修改圖8.7的類別，在建構子裡新增判斷輸入年，及新增nextDay方法來推進下一天的日期。
 * **************************************************************/

public class Date{
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year){
        if(month <= 0 || month > 12){
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        if(day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException("day (" + day + ") out-of-range for specified month and year");
        }

        if(month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))){
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        if(year > 2100 || year < 1900){
            throw new IllegalArgumentException("year (" + year + ") out-of-range (1900-2100)");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf("Date object constructor for date %s\n", this);
    }
    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
    }
    public void nextDay(){
        day++;
        if(month == 2){
            daysPerMonth[month] = (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
        }
        if(day > daysPerMonth[month]){
            day = 1;
            if(month == 12){
                month = 1;
                year++;
            }else{
                month++;
            }
        }
    }
    public static void main(String[] args){
        Date date = new Date(1, 1, 2023);
    
        for(int i = 0; i < 365; i++){
            date.nextDay();
            System.out.println("Day " + (i + 1) + ": " + date.toString());
        }
    }
}