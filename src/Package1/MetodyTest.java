package Package1;

import java.util.Scanner;

public class MetodyTest {


    public static void main(String[] args) {
        Metody metody = new Metody();

//        int result = metody.receiveAmount();
//        int result2 = result * 2;
//        System.out.println("wynik to: " + result);
//        System.out.println("wynik *2 to: " + result2);

//        metody.countAmountParam(2);
//        metody.countAmountParam(3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj 2 liczby");
        int jeden = scanner.nextInt();
        int dwa = scanner.nextInt();
        // int suma = metody.add(jeden, dwa);
        System.out.println("suma tych liczb to: " + metody.add(jeden, dwa));

    }
}
