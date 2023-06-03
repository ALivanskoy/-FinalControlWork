package Model.Animals;

public abstract class Animal {

    protected int age;

    public Animal(int age) {
        this.age = age;
    }

    protected abstract void makeSound();
}
