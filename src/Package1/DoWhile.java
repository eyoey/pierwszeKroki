package Package1;

public class DoWhile {

    public static void main(String[] args) {
        int number = 21;

        if (number < 20) {
            do {
                System.out.println("moja wartość to: " + number + " i jestem mniejszy od 20");
                number++;
            } while (number < 20);
        } else {
            System.out.println("liczba wieksza niz 20");
        }

    }
}
