import java.util.Scanner;

public class PracaDomowa1_calc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj kolejno 3 liczby (3 float)");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        float number3 = scanner.nextInt();
        System.out.println("Kwadrat pierwszej liczby to " + number1 * number1 + " !");
        System.out.println("Kwadrat drugiej liczby to " + number2 * number2 + " !");

        number1+=number2;
        System.out.println("po dodaniu: " + number1);
        number1-=number2;
        System.out.println("po odjeciu: " + number1);
        number1*=number2;
        System.out.println("po mnozeniu: " + number1);
        number1/=number2;
        System.out.println("po dzieleniu: " + number1);
        number1%=number2;
        System.out.println("po modulo: " + number1);

        int addition = number1+number2;
        int substraction = number1-number2;
        int multiplication = number1*number2;
        float division = number3/number2;
        int mod = number2%number1;

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + substraction);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Modulo: " + mod);
    }
}
