public class Student extends Person {
    private final Status status;
    //this was nifty
    public enum Status {Freshman, Sophomore, Junior, Senior}

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nStatus: " + getStatus());
    }
}