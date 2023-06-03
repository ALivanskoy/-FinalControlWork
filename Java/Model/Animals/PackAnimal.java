package Model.Animals;

public abstract class PackAnimal extends Pet {
    protected double loadCapacity;

    public PackAnimal(String name, int age, double loadCapacity) {
        super(name, age);
        this.loadCapacity = loadCapacity;
    }

    protected void transport (){
        makeSound();
    }

}
