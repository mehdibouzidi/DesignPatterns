package me.mbouzidi.designpatterns.structural.proxy;

import java.util.Arrays;
import java.util.List;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{

    @Override
    public List<String> listVideos() {
        //Do SomeWork
        return Arrays.asList();
    }

    @Override
    public List<String> getVideoInfo(int id) {
        //Do SomeWork
        return Arrays.asList();
    }

    @Override
    public void downloadVideo(int id) {
        //Do SomeWork
    }
}
