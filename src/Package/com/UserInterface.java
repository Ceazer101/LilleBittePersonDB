package Package.com;

import java.util.Scanner;

public class UserInterface {

    private Application application;

    public UserInterface(Application application) {
        this.application = application;
    }

    public void start() {

        System.out.println("Welcome to LilleBittePersonDB 2021");
        System.out.println("==========================\n");

        while (true) {
            switch (mainMenu()) {
                case 0 -> exit();
                case 1 -> list();
                case 2 -> create();
                case 3 -> delete();
                case 4 -> sort();
            }
        }

    }

    public int mainMenu() {
        System.out.println("""
                Main menu
                ---------
                1) List all person 
                2) Create new person
                3) Delete person
                4) Sorter liste
            
                0) Exit application
                """);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while(choice < 0 || choice > 3) {
            System.out.println("Only values 0-3 allowed");
            choice = input.nextInt();
        }

        return choice;
    }

    private void exit() {
        System.out.println("Thank you for using LilleBittePersonDB 2021");
        System.out.println("Please consider subscribing!");
        System.exit(0);
    }

    private void list() {
        System.out.println("List of all the people");
        System.out.println("-----------------------");
        for( Person person : application.getAllPeople() ) {
            System.out.println(person);
        }
    }

    public void sort(){
        application.sort();
    }

    private void create() {
        System.out.println("Create new person\n-----------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Firstname: ");
        String firstname = input.nextLine();
        System.out.print("Lastname: ");
        String lastname = input.nextLine();

        input.nextLine();

        application.createNewPerson(firstname,lastname);

        // When created a new animal, show the list again
        list();
    }

    private void delete() {
        System.out.println("Delete person");
        System.out.println("-------------");
        System.out.println("Please enter the firstname of the person to be deleted: ");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        application.deletePerson(firstName);
        System.out.println("The person with firstname '"+firstName+"' has been deleted");
    }

}
