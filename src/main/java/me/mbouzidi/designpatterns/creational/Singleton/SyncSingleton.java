package me.mbouzidi.designpatterns.creational.Singleton;

public class SyncSingleton {

    private static SyncSingleton instance;
    private SyncSingleton(){

    }


    public static SyncSingleton getInstance(){
        if(instance ==null){
            synchronized (SyncSingleton.class){
                if(instance==null){
                    instance = new SyncSingleton();
                }
            }
        }
        return instance;
    }
    
}
