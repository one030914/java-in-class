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
 * 此程式目的為創建時薪員工類別。
 * **************************************************************/

public class HourlyEmployee extends Employee {
    private double wage, hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0.0){
            throw new IllegalArgumentException("Wage cannot be negative.");
        }

        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0 (not included).");
        }

        this.wage = wage;
        this.hours = hours;
    }
    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }
    public double getWage(){
        return this.wage;
    }
    public void setHours(double hours){
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0 (not included).");
        }
        this.hours = hours;
    }
    public double getHours(){
        return this.hours;
    }
    @Override
    public double earnings(){
        if(getHours() <= 40){
            return getWage() * getHours();
        }else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    @Override
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hourly worked", getHours());
    }
}