import mvc.Person;
import mvc.PersonController;
import mvc.PersonView;

public class MVCSample {
    public static void main(String[] args) {
        // Create the Model
        Person person = new Person("John", 30);

        // Create the View
        PersonView personView = new PersonView();

        // Create the Controller
        PersonController personController = new PersonController(person, personView);

        // Display the initial data
        personController.updateView();

        // Update the Model and refresh the View
        personController.setPersonDetails("Alice", 25);
        personController.updateView();
    }
}
