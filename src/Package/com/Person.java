package Package.com;

public class Person implements java.lang.Comparable {
    private String firstname;
    private String lastname;

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname;
    }

    public int compareTo(Object other) {
        /*String ourFirstname = firstname;
        String otherFirstname = anotherPerson.firstname;
        if(ourFirstname.compareTo(otherFirstname) <= 0){
            return -1;
        } else {
            return 1;
        }*/
        Person anotherPerson = (Person) other;
        return firstname.compareTo(anotherPerson.firstname);
    }
}
