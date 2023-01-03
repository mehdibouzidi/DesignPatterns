package me.mbouzidi.designpatterns.behavioral.iterator;

public class ItMain {
    static SocialNetwork network;
    static SocialSpammer spammer;

    public static void main(String[] args) {
        String type="Facebook";
        config(type);
        Profile profile = new Profile();
        sendSpamToCoworkers(profile);

    }

    private static void config(String type) {
        if (type.equals("Facebook")){
            network = new Facebook();
            spammer = new SocialSpammer();
        }else {
            //Other Social Network
            /*this.network = new LinkedIn();
            this.spammer = new SocialSpammer();*/
        }
    }

    static void sendSpamToFriends(Profile profile) {
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
    static void sendSpamToCoworkers(Profile profile) {
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }
}
