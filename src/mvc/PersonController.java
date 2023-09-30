package mvc;
public class PersonController {
    private Person model;
    private PersonView view;

    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public void updateView() {
        view.printPersonDetails(model.getName(), model.getAge());
    }

    public void setPersonDetails(String name, int age) {
        model.setName(name);
        model.setAge(age);
    }
}
