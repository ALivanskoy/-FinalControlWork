package Model.Animals;

public class Camel extends PackAnimal {

    public Camel(String name, int age, double loadCapacity) {
        super(name, age, loadCapacity);
    }

    @Override
    protected void makeSound() {
        System.out.println("*негодует по-верблюжьи*");
    }

    @Override
    public void transport() {
        super.transport();
    }
}
