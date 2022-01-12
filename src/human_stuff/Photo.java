package human_stuff;

import java.util.Collections;
import java.util.HashSet;

public class Photo {
    private final HashSet<Object> thingsOnPhoto;

    public Photo(Object... thingsOnPhoto){
        this.thingsOnPhoto = new HashSet<>();

        Collections.addAll(this.thingsOnPhoto, thingsOnPhoto);
    }

    public HashSet<Object> getThingsOnPhoto() {
        return thingsOnPhoto;
    }
}
