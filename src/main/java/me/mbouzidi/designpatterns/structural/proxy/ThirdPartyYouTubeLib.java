package me.mbouzidi.designpatterns.structural.proxy;

import java.util.List;

public interface ThirdPartyYouTubeLib{
    List<String> listVideos();
    List<String> getVideoInfo(int id);
    void downloadVideo(int id);
}
