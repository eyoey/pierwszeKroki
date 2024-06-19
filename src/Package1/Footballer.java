package Package1;

public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("treść z konstruktora footballer");
        this.footballClub = footballClub;
    }

/*    public void eat () {
        System.out.println("nadpisane z klasy pilkarza");
    }*/

    public void playFootball() {
        System.out.println("Football!, Football!, football!");
        System.out.println("Name: " + name + ", " + "age: " + age + ", " + footballClub);
    }




}
