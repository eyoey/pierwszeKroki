public class InstrukcjaWarunkowaElseIfRef {

    public static void main(String[] args) {
        int number = -11;

        if (number > 0) {
            System.out.println("liczba wieksza od 0");
        } else if (number < -10) {
            System.out.println("liczba mniejsza od 10");
        } else if (number == 0) {
            System.out.println("liczba rowna 0");
        } else {
            System.out.println("liczba w przedziale od 0 do -10");
        }
    }
}
