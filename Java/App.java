import Controller.Controller;
import Model.Logic.AnimalList;

public class App {

    public static void main(String[] args) {
        Controller c = new Controller(new AnimalList());
        c.start();
    }
}
