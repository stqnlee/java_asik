package asik_22;
public class task9_22 {
    public static void main(String[] args) {
        Person person = new Person("Kaisar", "Nuryshev");
        System.out.println("Dossier.");
        System.out.println("Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Full name: " + person.getFullName());
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

