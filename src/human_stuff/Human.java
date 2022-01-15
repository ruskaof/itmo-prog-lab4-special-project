package human_stuff;

import interfaces.EventHoldable;
import interfaces.Nameable;
import interfaces.Ownable;

import java.util.Objects;

public class Human implements Ownable, EventHoldable, Nameable {
    private final String name;
    private Profession job;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", job=" + job +
                ", socialLife=" + socialLife +
                '}';
    }

    private final SocialLife socialLife;

    public Human(String name, Profession job) {
        this.socialLife = new SocialLife();
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public class SocialLife {

        public void makePost(Post post, SocialNetwork socialNetwork) {
            socialNetwork.makePost(post);
            System.out.println(name + " создал пост в социальной сети " + socialNetwork.getName());
        }

        @Override
        public String toString() {
            return "SocialLife{}";
        }
    }

    public SocialLife getSocialLife() {
        return socialLife;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && job == human.job && Objects.equals(socialLife, human.socialLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, job, socialLife);
    }
}
