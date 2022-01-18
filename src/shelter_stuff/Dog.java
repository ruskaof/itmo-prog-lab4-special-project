package shelter_stuff;

import interfaces.Nameable;
import interfaces.Ownable;

public class Dog extends Animal {
    protected final DogBreed breed;

    public Dog(String name, DogBreed breed) {
        super(name);
        this.breed = breed;
    }

    public Dog(String name, DogBreed breed, Ownable owner) {
        super(name);
        this.breed = breed;
        this.owner = owner;
    }

    public void setOwner(Ownable owner) {
        this.owner = owner;
    }

    @Override
    public String getName() {
        return name;
    }
}
