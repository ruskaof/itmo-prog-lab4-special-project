package human_stuff;

import abstract_things.Narrator;
import shelter_stuff.Event;
import shelter_stuff.Organization;

import java.util.Objects;
import java.util.Random;

public class Post {
    private final Photo photo;
    private final String text;
    private final Human author;
    private final Event event;
    private int likes;
    // пост может быть отнесен к какому-то ивенту, а может быть
    // и не отнесен, тогда значение поля null

    public Post(Photo photo, String text, Human author) {
        this.photo = photo;
        this.text = text;
        this.author = author;
        this.event = null;
        likes = new Random().nextInt(1_000_000);

        Narrator.tell("Был создан пост, автором которого является " + author.getName() + " с подписью \"" +
                text + "\" он набрал" + likes + " лайков");
    }

    public int getLikes() {
        return likes;
    }

    public Post(Photo photo, String text, Human author, Event event) {
        this.photo = photo;
        this.text = text;
        this.author = author;
        this.event = event;
        likes = new Random().nextInt(1_000_000);

        Narrator.tell("Был создан пост, автором которого является " + author.getName() + " с подписью \"" +
                text + "\". Этот пост относится к событию " + event.getName() + " он набрал " + likes + " лайков");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(photo, post.photo) && Objects.equals(text, post.text) && Objects.equals(author, post.author) && Objects.equals(event, post.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(photo, text, author, event);
    }

    @Override
    public String toString() {
        return "Post{" +
                "photo=" + photo +
                ", text='" + text + '\'' +
                ", author=" + author +
                ", event=" + event +
                '}';
    }
}
