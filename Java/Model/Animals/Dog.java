package Model.Animals;

public class Dog extends DomesticatedAnimal{

    public Dog(String name, int age, Boolean usability) {
        super(name, age, usability);
    }

    @Override
    protected void makeSound() {
        System.out.println("Гав!");
    }

    @Override
    protected void beNice() {
        makeSound();
    }
}
