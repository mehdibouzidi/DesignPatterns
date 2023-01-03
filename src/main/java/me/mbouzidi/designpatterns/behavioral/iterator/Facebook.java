package me.mbouzidi.designpatterns.behavioral.iterator;

import java.util.Arrays;
import java.util.List;

public class Facebook implements SocialNetwork{
    @Override
    public ProfileIterator createFriendsIterator(int profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(int profileId) {
        return new FacebookIterator(this, profileId, "coworkers");
    }

    public List<Profile> socialGraphRequest(int profileId, String type) {
        //Loading Profiles
        return Arrays.asList();
    }
}
