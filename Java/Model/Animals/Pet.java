package Model.Animals;

public abstract class Pet extends Animal {

protected String name;

    public Pet(String name, int age) {
        super(age);
        this.name = name;
    }
}
