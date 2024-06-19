package Package1;

import java.util.Scanner;

public class InstrukcjaWarunkowaElseIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();

        if(number == 0) {
            System.out.println("Liczba rowna 0");
        } else if (number > 0) {
            System.out.println("Liczba dodatnia");
        } else if (number > 10) {
            System.out.println("Numer większy od 10");
        } else if (number < -5) {
            System.out.println("Liczba mniejsza od -5");
        } else {
            System.out.println("wartość wykracza poza obsłużone warunki");
        }

    }
}
