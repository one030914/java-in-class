public abstract class Employee{
    private final String firstName, lastName, socialSecurityNumber;
    private Date birthDate;

    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    @Override
    public String toString() {
        return String.format("%s %s\nsocial security number: %s, birthday: %s", getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }
    public abstract double earnings();
}