import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pizza, Łosoś, Frytki czy inne (jakie?)");
        String danie = scanner.next();

        switch (danie) {
            case "Pizza":
                System.out.println("Cena pizzy to 22zł");
                break;
            case "Łosoś":
                System.out.println("Cena łososia to 35zł");
                break;
            case "Frytki":
                System.out.println("Cena frytek to 8zł");
                break;
            default:
                System.out.println("Brak " + danie + "a w karcie");
        }
    }
}
