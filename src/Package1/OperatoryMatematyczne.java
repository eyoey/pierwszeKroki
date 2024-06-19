package Package1;

public class OperatoryMatematyczne {
    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 6;
        float number3 = 4.0F;

        int addition = number1+number2;
        int substraction = number1-number2;
        int multiplication = number1*number2;
        float division = number3/number2;
        int mod = number2%number1;

        /*System.out.println("Dodawanie: " + addition);
        System.out.println("Odejmowanie: " + substraction);
        System.out.println("Dzielenie: " + division);
        System.out.println("Mnozenie: " + multiplication);
        System.out.println("Modulo: " + mod);*/

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
    }



}
