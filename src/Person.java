public class Person {
    private final String name;
    private final String address;
    private final String phoneNumber;
    private final String emailAddress;

    public Person(String name, String address, String phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
    //toString unnecessary here?
    @Override
    public String toString() {
        return "\nName: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nEmail Address: " + getEmailAddress();
    }
}