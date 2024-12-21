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