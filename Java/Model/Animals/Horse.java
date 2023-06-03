package Model.Animals;

public class Horse  extends PackAnimal{

    public Horse (String name, int age, double loadCapacity) {
        super(name, age, loadCapacity);
    }

    @Override
    protected void makeSound() {
        System.out.println("игого!");
    }

    @Override
    public void transport() {
        super.transport();
    }
}
