package human_stuff;

import interfaces.Ownable;
import shelter_stuff.Organization;

public class Human implements Ownable {
    private final String name;
    private Profession job;

    private final SocialLife socialLife;

    public Human(String name, Profession job) {
        this.socialLife = new SocialLife();
        this.name = name;
        this.job = job;
    }

    public class SocialLife {
        public void joinEvent(Organization.Event event) {
            event.addParticipant(Human.this);
        }

        public void makePost(Post post) {
            // TODO: сделать социальные сети и посты в них
        }
    }

    public SocialLife getSocialLife() {
        return socialLife;
    }


}
