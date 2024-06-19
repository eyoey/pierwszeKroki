package Package1;

public class InstrukcjaWarunkowaIf {

    public static void main(String[] args) {
        float dzielna = 4.0F;
        float dzielnik = 0.0F;

        if(dzielnik != 0) {
            System.out.println("Wynik dzielenia to: " + dzielna/dzielnik);
        } else {
            System.out.println("nie dziel przez 0");
        }
    }
}
