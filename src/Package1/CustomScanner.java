package Package1;

import java.util.Scanner;

public class CustomScanner {

/*    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imie");
        String name = scanner.nextLine();
        System.out.println("Cześć " + name + "!");
    }*/
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj liczbę");
            int firstNumber = scanner.nextInt();
            System.out.println("kwadrat tej liczby to: " + firstNumber * firstNumber);
        }
}
