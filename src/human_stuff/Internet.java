package human_stuff;

import java.util.ArrayList;
import java.util.HashSet;

public class Internet {
    private Internet() {
    }

    private ArrayList<SocialNetwork> socialNetworks = new ArrayList<SocialNetwork>();

    private static Internet instance = null;

    public static Internet getInstance() {
        if (instance == null) {
            instance = new Internet();
        }
        return instance;
    }

    public void addSocialNetwork(SocialNetwork socialNetwork) {
        socialNetworks.add(socialNetwork);
    }

    public ArrayList<SocialNetwork> getSocialNetworks() {
        return socialNetworks;
    }
}