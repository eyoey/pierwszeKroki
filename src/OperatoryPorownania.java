import java.util.Scanner;

public class OperatoryPorownania {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczby do porównania");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        /*int number1 = 4;
        int number2 = 6;*/

        boolean result = number1 > number2;

        System.out.println(result);
        System.out.println("a = b: " + (number1 == number2));
        System.out.println(number1 != number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);

    }
}
