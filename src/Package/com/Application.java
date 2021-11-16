package Package.com;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

    private ArrayList<Person> persons;

    public Application() {
        persons = new ArrayList<>();
    }

    public void start() {
        UserInterface ui = new UserInterface(this);
        ui.start();
    }

    public void sort(){
        Collections.sort(persons);
    }

    public static void main(String[] args) {
        new Application().start();
    }

    public Iterable<Person> getAllPeople() {
        return persons;
    }

    public void createNewPerson(String firstName, String lastName){
        Person person = new Person(firstName, lastName);
        persons.add(person);
    }

    public void deletePerson(String firstName){
        Person person = findPerson(firstName);
        if(person == null){
            System.out.println("This person does not exist");
        } else {
            persons.remove(person);
        }
    }

    public Person findPerson(String firstName){
        for (Person person : persons) {
            if(person.getFirstname().equalsIgnoreCase(firstName)){
                return person;
            }
        }
        return null;
    }

}
