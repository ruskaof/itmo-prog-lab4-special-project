package shelter_stuff;

import interfaces.Nameable;

public class Animal implements Nameable {
    protected final String name;

    Animal(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
