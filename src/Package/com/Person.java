package Package.com;

public class Person implements java.lang.Comparable {
    private final String firstname;
    private final String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname;
    }

    public int compareTo(Object other) {
        Person anotherPerson = (Person) other;
        return firstname.compareTo(anotherPerson.firstname);
    }
}
