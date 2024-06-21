package Package1;

public class User {

    public String username;
    public String password;
    public int age;


    public User() {
        //System.out.println("z konstruktora");
    }

    public User(String username, String password, int age) {
        this.username = username;
        this.password = password;
        this.age = age;
        //System.out.println("Z konstruktora hello " + " " + username);

    }

    public void sayHEllo() {
        System.out.println("Hello my name is " +  username);

    }
}
