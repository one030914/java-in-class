public class HourlyEmployee extends Employee {
    private double wage, hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber, birthDate);

        if(wage < 0.0){
            throw new IllegalArgumentException("Wage cannot be negative.");
        }

        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0 (not included).");
        }

        this.wage = wage;
        this.hours = hours;
    }
    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage cannot be negative.");
        }
        this.wage = wage;
    }
    public double getWage(){
        return this.wage;
    }
    public void setHours(double hours){
        if((hours < 0.0) || (hours > 168.0)){
            throw new IllegalArgumentException("Hours must be between 0.0 and 168.0 (not included).");
        }
        this.hours = hours;
    }
    public double getHours(){
        return this.hours;
    }
    @Override
    public double earnings(){
        if(getHours() <= 40){
            return getWage() * getHours();
        }else{
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
    }
    @Override
    public String toString(){
        return String.format("hourly employee: %s\n%s: $%,.2f; %s: %,.2f", super.toString(), "hourly wage", getWage(), "hourly worked", getHours());
    }
}