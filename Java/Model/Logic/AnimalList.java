package Model.Logic;

import Model.Animals.*;

import java.util.LinkedList;

public class AnimalList {
    private LinkedList<Animal> animalRegistry;

    public AnimalList() {
        this.animalRegistry = new LinkedList<>();
    }

    public LinkedList<Animal> getAnimalRegistry() {
        return animalRegistry;
    }
}
