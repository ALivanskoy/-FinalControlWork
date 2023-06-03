package Model.Animals;

public abstract class PackAnimal extends Pet {
    protected double loadCapacity;

    public PackAnimal(String name, int age, double loadCapacity) {
        super(name, age);
        this.loadCapacity = loadCapacity;
    }

    public PackAnimal(String name, int age) {
        this(name, age, 0);
    }
    protected void transport() {
        makeSound();
    }


}
