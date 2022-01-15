package shelter_stuff;

import abstract_things.Narrator;
import human_stuff.Human;
import interfaces.EventHoldable;

import java.util.HashSet;

public class Organization implements EventHoldable {
    private final String name;
    private final City city;
    private Event currentEvent;

    public Organization(String name, City city) {
        this.name = name;
        this.city = city;
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
