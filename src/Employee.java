public abstract class Employee extends Person {

    protected String department;
    protected double salary;
    protected String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.salary = salary;
        this.dateHired = dateHired;

    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getDateHired() {
        return this.dateHired;
    }
    @Override
    public String toString() {
        return (super.toString() +
                "\nDepartment: " + getDepartment() +
                "\nSalary: $" + getSalary() +
                "\nHire Date: " + getDateHired());
    }
}