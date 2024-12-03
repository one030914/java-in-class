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
 * 此程式目的為測試 Car 的類別及相關屬性與方法之程式。
 * **************************************************************/

import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("Model 3", "2017", 170);
        Car car2 = new Car("","", 0);

        System.out.printf("Enter car's model: ");
        String model = scanner.nextLine();
        System.out.printf("Enter the year of the car: ");
        String year = scanner.nextLine();
        System.out.printf("Enter price of the car: ");
        int price = scanner.nextInt();
        car2.set(model, year, price);
        System.out.printf("Car1 is the %s's %s car and price is $%.2f\n", car1.getYear(), car1.getModel(), car1.getPrice());
        System.out.printf("Car2 is the %s's %s car and price is $%.2f\n", car2.getYear(), car2.getModel(), car2.getPrice());


        System.out.printf("Car1 has 5%% discount, price is $%.2f\n", car1.getPrice() * 0.95);
        System.out.printf("Car2 has 7%% discount, price is $%.2f\n", car2.getPrice() * 0.93);
    }
}
