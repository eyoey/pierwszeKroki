import java.util.Scanner;

public class PracaDomowa_5_calc_v2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj kolejno 2 liczby");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("podaj kolejno 2 liczby dla dzielenia");
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();

        Calculator calculator = new Calculator();

        int addition = calculator.add(number1, number2);
        int subtraction = calculator.subtraction(number1, number2);
        int multiplication = calculator.multiplication(number1, number2);
        float division = calculator.division(number3, number4);
        int mod = calculator.modulo(number1, number2);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mnożenie: " + multiplication);
        System.out.println("Modulo: " + mod);
    }
}
