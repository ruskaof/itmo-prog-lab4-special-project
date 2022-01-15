package human_stuff;

import abstract_things.Narrator;
import interfaces.Nameable;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;

public class Photo {
    private final HashSet<Nameable> thingsOnPhoto;

    public Photo(Nameable... thingsOnPhoto){
        this.thingsOnPhoto = new HashSet<>();
        Collections.addAll(this.thingsOnPhoto, thingsOnPhoto);

        String names = "";
        for (Nameable i : thingsOnPhoto) {
            names += i.getName() + ", ";
        }
        names = names.substring(0,names.length() - 2);

        Narrator.tell("Была создана фотография, на которой изображены " + names);
    }

    public HashSet<Nameable> getThingsOnPhoto() {
        return thingsOnPhoto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(thingsOnPhoto, photo.thingsOnPhoto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thingsOnPhoto);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "thingsOnPhoto=" + thingsOnPhoto +
                '}';
    }
}
