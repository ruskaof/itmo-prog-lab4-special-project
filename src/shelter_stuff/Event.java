package shelter_stuff;

import abstract_things.GlobalTime;
import abstract_things.Narrator;
import human_stuff.Human;
import interfaces.EventHoldable;
import interfaces.Nameable;

import java.util.HashSet;

public abstract class Event {
    private final EventHoldable holder;
    private final String name;
    private boolean isEnded = false;
    private final HashSet<Human> participants = new HashSet<>();

    public Event(String name, EventHoldable holder) {
        this.name = name;
        this.holder = holder;
    }

    public String getName() {
        return name;
    }

    public void end() {
        isEnded = true;
        Narrator.tell(getName() + " завершился");
    }

    public boolean getIsEnded() {
        return isEnded;
    }

    public void addParticipant(Human human) {
        participants.add(human);
        Narrator.tell(human.getName() + " теперь учавствует в событии " + name);
    }

    public Object getHolder() {
        return holder;
    }

    public HashSet<Human> getParticipants() {
        return participants;
    }


    public abstract void doEventAction();

}