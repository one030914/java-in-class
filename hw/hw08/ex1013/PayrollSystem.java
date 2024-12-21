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
 * 此程式目的為利用多態類別，列印出每種員工的薪資單，並在員工當月生日中給予100元的獎金。
 * **************************************************************/

public class PayrollSystem{
    public static void main(String[] args){
        Date[] dates = {new Date(2, 24, 1991), new Date(4, 13, 1989), new Date(1, 4, 1970), new Date(10, 11, 1991)};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        SalariedEmployee salaried = new SalariedEmployee("John", "smith", "111-11-1111", dates[0], 800.00);
        HourlyEmployee hourly = new HourlyEmployee("Jane", "Doe", "222-22-2222", dates[1], 15.00, 40);
        CommissionEmployee commission = new CommissionEmployee("Bob", "Johnson", "333-33-3333", dates[2], 10000.00, 0.05);
        BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", dates[3], 5000, 0.04, 300);
        Employee[] employees = new Employee[4];

        employees[0] = salaried;
        employees[1] = hourly;
        employees[2] = commission;
        employees[3] = base;

        System.out.println("Employees processed polymorphically:\n");

        for(int i = 0; i < 12 ; i++) {
            System.out.println(months[i]);
            for(Employee employee : employees){
                System.out.println(employee);

                if(employee.getBirthDate().getMonth() == i + 1){
                    System.out.printf("Birth Day bonus $100\nearned $%,.2f\n\n", employee.earnings() + 100);
                }else{
                    System.out.printf("earned $%,.2f\n\n", employee.earnings());
                }
            }
            System.out.println("-----------------------------------------");
        }
    }
}