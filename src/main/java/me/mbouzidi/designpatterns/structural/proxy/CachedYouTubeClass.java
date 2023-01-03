package me.mbouzidi.designpatterns.structural.proxy;

import java.util.List;

/**
 * Source: https://refactoring.guru/design-patterns/proxy
 * ***/
public class CachedYouTubeClass implements ThirdPartyYouTubeLib{
    private ThirdPartyYouTubeLib service;
    private List<String> listCache, videoCache;
    boolean needReset;

    public CachedYouTubeClass() {
    }

    public CachedYouTubeClass(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    @Override
    public List<String> listVideos() {
        if(listCache == null || needReset){
            videoCache =  service.listVideos();
        }
        return videoCache;
    }

    @Override
    public List<String> getVideoInfo(int id) {
        if(listCache == null || needReset){
            videoCache =  service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        if(!downloadExists(id) || needReset){
            service.downloadVideo(id);
        }
    }

    private boolean downloadExists(int id) {
        return false;
    }
}
