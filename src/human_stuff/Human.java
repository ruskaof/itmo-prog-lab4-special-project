package human_stuff;

import shelter_stuff.Organization;

public class Human {
    private final SocialLife socialLife;

    public Human() {
        this.socialLife = new SocialLife();
    }

    class SocialLife {
        public void joinEvent(Organization.Event event) {
            event.addParticipant(Human.this);
        }
    }
}
