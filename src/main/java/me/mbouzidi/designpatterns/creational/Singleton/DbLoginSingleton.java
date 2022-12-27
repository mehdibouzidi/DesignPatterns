package me.mbouzidi.designpatterns.creational.Singleton;
/**
 * #RefactoringGuru
 * Use the Singleton pattern when a class in your program should have just a single instance available to all clients; for example, a single database object shared by different parts of the program.
 * */
public class DbLoginSingleton {

    private String login;
    private String password;
    private static DbLoginSingleton instance;
    private DbLoginSingleton(){

    }

    private DbLoginSingleton(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public static DbLoginSingleton getInstance(){
        if(instance ==null){
            instance = new DbLoginSingleton("pseudo","password");
        }
        return instance;
    }

    public void connectToDb(){
        try{
           //Connect to Db with "login" and "password"
        }catch (Exception e){

        }
    }
}
