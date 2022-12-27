package me.mbouzidi.designpatterns.creational.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        DbLoginSingleton dbLogin = DbLoginSingleton.getInstance();
        System.out.println(dbLogin);
        DbLoginSingleton dbLogin_2 = DbLoginSingleton.getInstance();
        System.out.println(dbLogin_2);
        //Same Object Reference
        System.out.println(dbLogin==dbLogin_2);
    }
}
