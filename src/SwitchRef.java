import javax.sound.midi.Soundbank;

public class SwitchRef {

    public static void main(String[] args) {
        String danie = "Pizza";

        switch (danie) {
            case "Pizza":
                System.out.println("Cena pizzy to 22zł)");
                break;
            case "Losoś":
                System.out.println("Cena łososia to 35zł");
                break;
            case "Frytki":
                System.out.println("Cena frytek to 8zł");
                break;
            default:
                System.out.println("Brak podanego dania w karcie");
        }
    }
}
