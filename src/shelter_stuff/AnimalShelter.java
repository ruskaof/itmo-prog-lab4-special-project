package shelter_stuff;

import java.util.HashSet;

public class AnimalShelter extends Organization {
    public AnimalShelter(String name, City city) {
        super(name, city);
    }

    private HashSet<Animal> animals = new HashSet<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
