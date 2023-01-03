package me.mbouzidi.designpatterns.behavioral.iterator;

import java.util.List;

public class FacebookIterator implements ProfileIterator{

    private Facebook facebook;
    private int profileId;
    private String type;
    private int currentPosition;
    private List<Profile> cache;

    public FacebookIterator() {
    }

    public FacebookIterator(Facebook facebook, int profileId, String type) {
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if (cache == null)
            cache = facebook.socialGraphRequest(profileId, type);
    }
    @Override
    public Profile getNext() {
        if (hasMore())
            currentPosition++;
        return cache.get(currentPosition);
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.size();
    }
}
