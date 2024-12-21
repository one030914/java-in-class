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
 * 此程式目的為創建傭金員工類別。
 * **************************************************************/

public class CommissionEmployee extends Employee {
    private double grossSales, commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Invalid commission rate, must be between 0.0 and 1.0.");
        }

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Invalid gross sales, must be a positive number.");
        }

        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public void setGrossSales(double grossSales) {
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Invalid gross sales, must be a positive number.");
        }
        this.grossSales = grossSales;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Invalid commission rate, must be between 0.0 and 1.0.");
        }
        this.commissionRate = commissionRate;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString(){
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), "gross sales", getGrossSales(), "commission rate", getCommissionRate());
    }
}