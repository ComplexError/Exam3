public class Staff extends Employee {
    private final String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String title, String department, double salary, String dateHired) {
        super(name, address, phoneNumber, emailAddress, department, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nTitle: " + getTitle());
    }
}