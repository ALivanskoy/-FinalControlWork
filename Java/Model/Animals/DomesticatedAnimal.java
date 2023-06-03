package Model.Animals;

public abstract class  DomesticatedAnimal extends Pet {

protected boolean usability;
    public DomesticatedAnimal(String name, int age, Boolean usability) {
        super(name, age);
        this.usability = usability;
    }

    protected abstract void beNice();
}
