package shelter_stuff;

import human_stuff.Human;
import interfaces.EventAction;

import java.util.HashSet;

public class Organization {
    private final String name;
    private final City city;
    private Event currentEvent;

    public Organization(String name, City city) {
        this.name = name;
        this.city = city;
    }

    public abstract static class Event {
        private final Object holder;
        private final String name;
        private boolean isEnded = false;
        private final HashSet<Human> participants = new HashSet<>();
        private int yearOfCreation;

        public Event(String name, Object holder) {
            this.name = name;
            this.holder = holder;
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

        public Object getHolder() {
            return holder;
        }

        public HashSet<Human> getParticipants() {
            return participants;
        }

        public abstract void doEventAction();
    }

    public void makeEvent(Event event) {
        this.currentEvent = event;
    }



    public void endEvent() {
        currentEvent.end();
        currentEvent = null;
    }

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public String getName() {
        return name;
    }
}
