package Model.Animals;

public class Hamster extends DomesticatedAnimal {
    public Hamster(String name, int age, Boolean usability) {
        super(name, age, usability);
    }

    @Override
    protected void makeSound() {
        System.out.println("Заведи другое животное");
    }

    @Override
    protected void beNice() {
        makeSound();
    }
}
