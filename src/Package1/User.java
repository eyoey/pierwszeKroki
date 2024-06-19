package Package1;

import javax.sound.midi.Soundbank;

public class User {

    public String username;
    public String password;


    public User() {
        //System.out.println("z konstruktora");
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        System.out.println("Z konstruktora hello " + " " + username);

    }

    public void sayHEllo() {
        System.out.println("Hello my name is " +  username);

    }
}
