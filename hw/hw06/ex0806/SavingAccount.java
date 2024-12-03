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
 * 此程式目的為計算存款利息。
 * **************************************************************/

public class SavingAccount{
    private static double annualInterestRate = 0.0;
    private double savingBalance = 0.0;
    
    public SavingAccount(double Balance){
        if(Balance >= 0){
            this.savingBalance = Balance;
        }
    }
    public void calculateMonthlyInterest(){
        this.savingBalance += this.savingBalance * this.annualInterestRate / 12;
    }
    public void modifyInterestRate(double rate){
        this.annualInterestRate = rate;
    }
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    public double getSavingBalance(){
        return this.savingBalance;
    }
    public static void main(String[] args){
        SavingAccount saver1 = new SavingAccount(2000.00);
        SavingAccount saver2 = new SavingAccount(3000.00);

        System.out.printf("Original saver1 balance: %.2f\n", saver1.getSavingBalance());
        System.out.printf("Original saver2 balance: %.2f\n\n", saver2.getSavingBalance());

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        for(int i = 0; i < 12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("4%% rate of saver1 in 12 months: %.2f\n", saver1.getSavingBalance());
        System.out.printf("4%% rate of saver2 in 12 months: %.2f\n\n", saver2.getSavingBalance());

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("5%% rate of saver1 in a month: %.2f\n", saver1.getSavingBalance());
        System.out.printf("5%% rate of saver2 in a month: %.2f\n", saver2.getSavingBalance());
    }
}