package shelter_stuff;

import interfaces.Ownable;

import java.util.HashSet;

public class AnimalShelter extends Organization implements Ownable {
    public AnimalShelter(String name, City city) {
        super(name, city);
    }

    private HashSet<Animal> animals = new HashSet<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public HashSet<Animal> getAnimals() {
        return animals;
    }
}
