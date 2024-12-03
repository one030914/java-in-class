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
 * 此程式目的為創建 Car 的類別及相關屬性與方法。
 * **************************************************************/

public class Car {
    String model = "", year = "";
    double price = 0.0;

    public Car(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0.0) {
            this.price = price;
        }else{
            this.price = 0.0;
        }
    }
    public void set(String model, String year, double price) {
        this.model = model;
        this.year = year;
        if (price > 0.0) {
            this.price = price;
        }else{
            this.price = 0.0;
        }
    }
    public String getModel() {
        return this.model;
    }
    public String getYear() {
        return this.year;
    }
    public double getPrice() {
        return this.price;
    }
}
