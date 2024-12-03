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
 * 此程式目的為創建 Account 的類別及相關屬性與方法。
 * **************************************************************/

class Account {
    private String name;
    private double balance;

    public Account(String name, double balance){
        this.name = name;

        if(balance > 0.0){
            this.balance = balance;
        }
    }
    public void deposit(double amount){
        if (amount > 0.0){
            balance += amount;
        }
    }
    public void withdraw(double amount){
        if (amount > this.balance) {
            System.out.printf("Withdrawal amount exceeded account balance.\n");
            
        }else if (amount > 0.0) {
            balance -= amount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
