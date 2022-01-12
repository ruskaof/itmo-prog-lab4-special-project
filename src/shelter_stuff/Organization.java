package shelter_stuff;

import human_stuff.Human;

import java.util.HashSet;

public class Organization {
    private final String name;
    private final City city;
    private final HashSet<Event> events = new HashSet<Event>(); // make private

    public Organization(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public static class Event {
        private final String name;
        private boolean isEnded = false;
        private final HashSet<Human> participants = new HashSet<>();
        private int yearOfCreation;

        public Event(String name) {
            this.name = name;

        }

        public String getName() {
            return name;
        }

        public void end() {
            isEnded = true;
        }

        public boolean getIsEnded() {
            return isEnded;
        }

        public void addParticipant(Human human) {
            participants.add(human);
        }
    }

    public void makeEvent(String eventName) {

    }

    public void endEvent(String eventName) {
        for (Event event : events) {
            if (event.getName().equals(eventName)) {
                event.end();
                break;
            }
        }
    }

    public String getName() {
        return name;
    }
}
