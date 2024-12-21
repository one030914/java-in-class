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
 * 此程式目的為創建抽象員工類別。
 * **************************************************************/

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