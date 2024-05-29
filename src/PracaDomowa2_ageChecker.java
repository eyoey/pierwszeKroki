import java.util.Scanner;

public class PracaDomowa2_ageChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("jaki jest Twój wiek (proszę podać pełne lata)");
        int wiek = scanner.nextInt();


        if ((wiek < 0) || (wiek > 120)) {
            System.out.println("Proszę wpisać poprawny wiek");
        } else if (wiek >= 18){
            System.out.println("Zapraszamy do zakupów");
        } else {
            System.out.println("Nie możesz dokonać zakupów w naszym sklepie");
        }


       /* if (wiek < 18 && wiek > 0) {
            System.out.println("Nie możesz dokonać zakupów w naszym sklepie");
        } else if (wiek < 0 ) {
            System.out.println("podaj poprawny wiek");
        } else {
            System.out.println("witamy");
        }*/

        /*((wiek < 18) || (wiek > 100)) {
            System.out.println("zły wiek");
        } else if {
            System.out.println("Zapraszamy do zakupów");*/

       /* if (wiek >= 110) {
            System.out.println("Proszę wpisać poprawny wiek (100+)");
        }else if (wiek >= 18) {
            System.out.println("Zapraszamy do zakupów");
        } else if (wiek <= 0) {
            System.out.println("Proszę wpisać poprawny wiek (<0)");
        }else if (wiek < 18) {
            System.out.println("Nie możesz dokonać zakupów w naszym sklepie");
        }*/
        }
    }

