package Package.com;

import java.util.Collections;

public class UserInterface {

    public void start(){
        Application app = new Application();

        System.out.println(app.getPersons());

        Collections.sort(app.getPersons());

        System.out.println(app.getPersons());
    }
}
