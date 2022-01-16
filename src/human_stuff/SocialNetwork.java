package human_stuff;

import java.util.ArrayList;
import java.util.HashSet;

public class SocialNetwork {
    private final String name;
    private final ArrayList<Post>  posts = new ArrayList<Post>();
    private final ArrayList<Human> users = new ArrayList<>();

    public SocialNetwork(String name) {
        this.name = name;
        Internet.getInstance().addSocialNetwork(this);
    }

    public void makePost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void addUser (Human human) {
        users.add(human);
    }

    public ArrayList<Human> getUsers() {
        return users;
    }

    public String getName() {
        return name;
    }
}
