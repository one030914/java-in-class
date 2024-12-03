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
 * 此程式目的為測試 PetrolPurchase 的類別及相關屬性與方法之程式。
 * **************************************************************/

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PetrolPurchase buyer1 = new PetrolPurchase("St. A", "92", 29, 3.0, 30.0);
        PetrolPurchase buyer2 = new PetrolPurchase("", "", 0, 0.0, 0.0);
        
        System.out.printf("Enter the location: ");
        String location = scanner.nextLine();
        System.out.printf("Enter the type: ");
        String type = scanner.nextLine();
        System.out.printf("Enter the quantity: ");
        int quantity = scanner.nextInt();
        System.out.printf("Enter the lithers: ");
        double lither = scanner.nextDouble();
        System.out.printf("Enter the discount: ");
        double discount = scanner.nextDouble();
        buyer2.set(location, type, quantity, lither, discount);
        // lither, type, location, quantity, discount
        System.out.printf("Buyer1 is add %.2f lithers of %s petrol at place %s, $%d per lither, and there is a $%.2f discount\n", buyer1.getlither(), buyer1.gettype(), buyer1.getlocation(), buyer1.getquantity(), buyer1.getdiscount());
        System.out.printf("Buyer2 is add %.2f lithers of %s petrol at place %s, $%d per lither, and there is a $%.2f discount\n", buyer2.getlither(), buyer2.gettype(), buyer2.getlocation(), buyer2.getquantity(), buyer2.getdiscount());
        scanner.close();
        
        System.out.printf("Buyer1 is purchased $%.2f\n", buyer1.getPurchaseAmount());
        System.out.printf("Buyer2 is purchased $%.2f\n", buyer2.getPurchaseAmount());
    }
}
