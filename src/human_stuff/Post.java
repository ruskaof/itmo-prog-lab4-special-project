package human_stuff;

import shelter_stuff.Organization;

public class Post {
    private final Photo photo;
    private final String text;
    private final Human author;
    private final Organization.Event event;
    // пост может быть отнесен к какому-то ивенту, а может быть
    // и не отнесен, тогда значение поля null

    public Post(Photo photo, String text, Human author) {
        this.photo = photo;
        this.text = text;
        this.author = author;
        this.event = null;
    }

    public Post(Photo photo, String text, Human author, Organization.Event event) {
        this.photo = photo;
        this.text = text;
        this.author = author;
        this.event = event;
    }
}
