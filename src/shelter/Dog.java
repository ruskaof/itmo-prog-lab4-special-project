package shelter;

import shelter.Animal;

public class Dog extends Animal {
    protected final DogBreed breed;

    Dog(String name, DogBreed breed){
        super(name);
        this.breed = breed;
    }
}
