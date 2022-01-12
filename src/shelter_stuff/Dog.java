package shelter_stuff;

public class Dog extends Animal {
    protected final DogBreed breed;

    public Dog(String name, DogBreed breed){
        super(name);
        this.breed = breed;
    }
}
