package shelter_stuff;

import interfaces.Nameable;
import interfaces.Ownable;

public class Animal implements Nameable {
    protected Ownable owner;
    protected final String name;

    Animal(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setOwner(Ownable owner) {
        this.owner = owner;
    }
}
