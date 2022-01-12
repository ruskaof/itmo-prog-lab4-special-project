package shelter;

import shelter.Animal;

import java.util.HashSet;

public class AnimalShelter extends Organization {
    AnimalShelter(String name, City city) {
        super(name, city);
    }

    private HashSet<Animal> animals = new HashSet<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
