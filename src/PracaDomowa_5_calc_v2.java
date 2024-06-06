import java.util.Scanner;

public class PracaDomowa_5_calc_v2 {


    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj kolejno 2 liczby");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("podaj kolejno 2 liczby dla dzielenia");
        float number3 = scanner.nextFloat();
        float number4 = scanner.nextFloat();
        //float number3 = scanner.nextInt();
       // System.out.println("Kwadrat pierwszej liczby to " + number1 * number1 + " !");
       // System.out.println("Kwadrat drugiej liczby to " + number2 * number2 + " !");

        //pierwszy sposób
//        number1+=number2;
//        System.out.println("po dodaniu: " + number1);
//        number1-=number2;
//        System.out.println("po odjeciu: " + number1);
//        number1*=number2;
//        System.out.println("po mnozeniu: " + number1);
//        number1/=number2;
//        System.out.println("po dzieleniu: " + number1);
//        number1%=number2;
//        System.out.println("po modulo: " + number1);

        //drugi sposob
        int addition = calculator.add(number1, number2);
        int subtraction = calculator.subtraction(number1, number2);
        int multiplication = calculator.multiplication(number1, number2);
        float division = calculator.division(number3, number4);
        int mod = calculator.modulo(number1, number2);

        System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + subtraction);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Modulo: " + mod);
    }
}
