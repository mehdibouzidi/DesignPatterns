package me.mbouzidi.designpatterns.structural.proxy;

public class YouTubeManager {
    private ThirdPartyYouTubeLib service;

    public YouTubeManager() {
    }

    public YouTubeManager(ThirdPartyYouTubeLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id){
        service.getVideoInfo(id);
    }

    public void renderListPanel(){
        service.listVideos();
    }

    public void reactOnUserInput(){
        renderVideoPage(1);
        renderListPanel();
        System.out.println("REACT FINISHED !");
    }
}
