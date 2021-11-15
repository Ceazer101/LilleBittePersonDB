package Package.com;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

    private ArrayList<Person> persons = new ArrayList<>();

    public Application(){
        addPerson(new Person("Kenneth", "Lønfeldt"));
        addPerson(new Person("Chris", "Lønborg"));
        addPerson(new Person("Güler", "Nur"));
    }

    public void sortPerson(){
        Collections.sort(persons);
    }


    public void addPerson(Person Person){
        persons.add(Person);
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}
