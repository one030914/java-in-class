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
 * 此程式目的為修改9.4.5小節的CommissionEmployee類別，讓其類別為Employee的子類別，且輸出結果應與原本一致。
 * **************************************************************/

public class ex0914{
    public static void main(String[] args){
        CommissionEmployee_ employee1 = new CommissionEmployee_("John", "Wick", "123A456", 1000, 0.4);
        BasePlusCommissionEmployee employee2 = new BasePlusCommissionEmployee("John", "Wick", "123A456", 1000, 0.4, 500);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}

class Employee{
    private String firstName = "", lastName = "", socialSecurityNumber = "";

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public String toString() {
        return String.format("Employee: %s %s, social security number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
    }
}

class CommissionEmployee_ extends Employee{ //new CommissionEmployee class
    private double grossSales = 0.0, commissionRate = 0.0;

    public CommissionEmployee_(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commission){
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        if(commission <= 0.0 || commission >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0(not included).");
        }
        
        this.grossSales = grossSales;
        this.commissionRate = commission;
    }
    public void setGrossSales(double sales){
        if(sales < 0.0){
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        this.grossSales = sales;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    public void setCommissionRate(double rate){
        if(rate <= 0.0 || rate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0(not included).");
        }
        this.commissionRate = rate;
    }
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }
    @Override
    public String toString(){
        return String.format("%s, gross sales: %.2f, commission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}

class CommissionEmployee{
    private String firstName = "", lastName = "", socialSecurityNumber = "";
    private double grossSales = 0.0, commissionRate = 0.0;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commission){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        if(commission <= 0.0 || commission >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0(not included).");
        }
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.grossSales = grossSales;
        this.commissionRate = commission;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }
    public void setGrossSales(double sales){
        if(sales < 0.0){
            throw new IllegalArgumentException("Gross sales cannot be negative.");
        }
        this.grossSales = sales;
    }
    public double getGrossSales(){
        return this.grossSales;
    }
    public void setCommissionRate(double rate){
        if(rate <= 0.0 || rate >= 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0(not included).");
        }
        this.commissionRate = rate;
    }
    public double getCommissionRate(){
        return this.commissionRate;
    }
    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }
    public String toString(){
        return String.format("Employee: %s %s, social security number: %s, gross sales: %.2f, commission rate: %.2f",
        getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate()); 
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary = 0.0;
    
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commission, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commission);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }
    @Override
    public double earnings(){
        return super.earnings() + this.baseSalary;
    }
    @Override
    public String toString(){
        return String.format("%s, base salary: %.2f", super.toString(), getBaseSalary());
    }
}