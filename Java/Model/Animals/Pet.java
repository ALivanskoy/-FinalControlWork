package Model.Animals;

import Model.Logic.GetClassName;

public abstract class Pet extends Animal {

protected String name;

    public Pet(String name, int age) {
        super(age);
        this.name = name;
    }

    @Override
    public String toString() {
        return "[Животное = " + GetClassName.nameRefactor( this.getClass().getName() ) +
                ", Имя = '" + name + '\'' +
                ", Возраст = " + age + ']';
    }
}
