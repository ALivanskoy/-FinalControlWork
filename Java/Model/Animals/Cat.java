package Model.Animals;

public class Cat extends DomesticatedAnimal{

    public Cat(String name, int age, Boolean usability) {
        super(name, age, false);
    }

    @Override
    protected void makeSound() {

        System.out.println("Мяу");

    }

    @Override
    protected void beNice() {

        makeSound();
        System.out.println("Ты был оцарапан. Котом");

    }
}
