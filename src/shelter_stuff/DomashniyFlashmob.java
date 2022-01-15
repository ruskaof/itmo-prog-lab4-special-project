package shelter_stuff;

import abstract_things.Narrator;
import com.sun.tools.javac.Main;
import exceptions.InvalidHolderOfEventException;
import human_stuff.*;
import interfaces.EventHoldable;

import java.util.HashSet;
import java.util.Random;

public class DomashniyFlashmob extends Event {
    // Так как глупые знаменитости не могут придумать даже подписи к своим постам,
    // этим занимаются не они.
    String[] captions;

    public DomashniyFlashmob(String name, EventHoldable holder, String[] captions) {
        super(name, holder);
        if (!(holder instanceof AnimalShelter)) {
            throw new InvalidHolderOfEventException("Please Use AnimalShelter object as holder of this event");
        }
        this.captions = captions;
    }

    @Override
    public void doEventAction() {
        HashSet<Animal> remainingAnimals = ((AnimalShelter) getHolder()).getAnimals();
        for (Human human : getParticipants()) {
            for (Animal animal : remainingAnimals) {
                Post post = new Post(new Photo(human, animal), captions[new Random().nextInt(4)] , human, this);
                SocialNetwork[] socialNetworks = new SocialNetwork[Internet.getInstance().getSocialNetworks().size()];
                socialNetworks = Internet.getInstance().getSocialNetworks().toArray(socialNetworks);
                human.getSocialLife().makePost(post, socialNetworks[new Random().nextInt(socialNetworks.length)]);

                if (post.getLikes() > 50_000) remainingAnimals.remove(animal);
                Narrator.tell("Благодаря " + human.getName() + " " + animal.getName() + " был успешно забран из приюта" +
                        " в добрые руки!");
                break;
            }
        }
    }

}