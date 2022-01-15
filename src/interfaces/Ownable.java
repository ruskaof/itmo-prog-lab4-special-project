package interfaces;

import abstract_things.Narrator;
import shelter_stuff.Animal;
import shelter_stuff.AnimalShelter;

// Означает, что класс может быть хозяином животного
public interface Ownable extends Nameable{
    public default void takeFromAnimalShelter(AnimalShelter animalShelter, Animal animal) {
        animalShelter.removeAnimal(animal);
        Narrator.tell(this.getName() + " теперь владеет " + animal.getName());
    }
}
