public class Faculty extends Employee {
    private final Rank rank;
    enum Rank {Junior, Senior}
    private final String officeHours;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double salary, String dateHired, String officeHours, Rank rank) {
        super(name, address, phoneNumber, emailAddress, department, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours () {
        return this.officeHours;
    }
    public Rank getRank () {
        return this.rank;
    }

    @Override
    public String toString () {
        return (super.toString() +
                "\nOffice Hours: " + getOfficeHours() +
                "\nRank: " + getRank());
    }
}