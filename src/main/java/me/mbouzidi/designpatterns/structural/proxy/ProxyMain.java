package me.mbouzidi.designpatterns.structural.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ThirdPartyYouTubeClass youtubeService = new ThirdPartyYouTubeClass();
        CachedYouTubeClass proxy = new CachedYouTubeClass(youtubeService);
        YouTubeManager manager = new YouTubeManager(proxy);
        manager.reactOnUserInput();
    }
}
