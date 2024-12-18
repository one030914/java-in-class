public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary cannot be negative.");
        }

        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("Weekly salary cannot be negative.");
        }
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
    @Override
    public String toString() {
        return String.format("Salaried Employee: %s\n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}