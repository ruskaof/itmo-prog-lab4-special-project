package human_stuff;

import java.util.ArrayList;

public class SocialNetwork {
    private final String name;
    private final ArrayList<Post>  posts = new ArrayList<Post>();

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

    public String getName() {
        return name;
    }
}
