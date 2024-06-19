package Package1;

public class App {


    public static String name;

    public App(String name) {
        this.name = name;
    }


    public void appInfo () {
        System.out.println("Czy ktoś wołał appInfo? nazwa to: " + name);

    }
}
