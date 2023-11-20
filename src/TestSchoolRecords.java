public class TestSchoolRecords {

    public static void main(String[] args) {
        Person[] schoolMembers = new Person[]{
                new Faculty("Late Lewis", "Headstone#54 Cemetery St", "000-000-0000", "lewisbox.spam@spamzone.usa", "Deceased", 0.01, "11/19/2023", "Anytime", Faculty.Rank.Junior),
                new Student("Pete Parole", "2743 Nowhere Dr", "808-800-8888", "Parole37@cyberspace.net", Student.Status.Senior),
                new Staff("Puppet Janitorius", "God knows where...", "###-###-####", "only uses handwritten notes on napkins", "ThE JaNiToR", "Absolute Sanitization", 13.49, "00/00/2000"),
                new Faculty("Narcotic Nate", "01 Morphine Ave", "800-222-1222", "NarcoNate@poison.org", "Of Doctors", 420.69, "3/14/1823", "6pm - 3am", Faculty.Rank.Senior),
                new Staff("Margret Reins", "4605 W Main Lane", "123-456-7890", "MR.E@email.net", "Executive", "Administration", 999.98, "7/23/2010"),
                new Student("Lethargic Individual", "303 Sleepy Joe Rd", "702-702-5434", "leth.ind@dozymail.com", Student.Status.Freshman),
        };

        System.out.println("\nAll members:");
        for (Person file : schoolMembers) {
            System.out.println(file.toString());
        }

        //this could have been a lot cleaner and was completely unneeded, but I wanted to sort and identify each of the employees. So it's more like useless fluff
        System.out.println("\nSchool Employees:");
        Person[] employeeArray = employeesOnRecord(schoolMembers);
        for (Person file : employeeArray) {
            String employeeType;
            if (file instanceof Staff) {
                employeeType = "\n  Staff:";
            }
            else if (file instanceof Faculty) {
                employeeType = "\n  Faculty:";
            }
            else {
                break;
            }
            System.out.println(employeeType + file);
        }
    }

    public static Person[] employeesOnRecord(Person[] schoolMembers) {
        Person[] employeeArray = new Person[schoolMembers.length];
        int k = 0;

        for (Person file : schoolMembers) {
            if (file instanceof Employee) {
                employeeArray[k] = file;
                k++;
            }
        }
        return employeeArray;
    }
}