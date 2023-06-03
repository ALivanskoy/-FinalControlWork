package Model.Animals;

public class Donkey extends PackAnimal{
    public Donkey(String name, int age, double loadCapacity) {
        super(name, age, loadCapacity);
    }

    @Override
    protected void makeSound() {
        System.out.println("иа-иа!");
    }

    @Override
    public void transport() {
        super.transport();
    }
}
