package me.mbouzidi.designpatterns.behavioral.iterator;

public class SocialSpammer {
    public void send( ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Email:"+ profile.getEmail()+ " / Message: "+ message);
        }
    }
}
