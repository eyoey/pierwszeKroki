package Package1;

import java.util.Scanner;

public class OperatoryLogiczne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Podaj 2 liczby i uzyskaj odpowiedz czy to są takie same liczby");
        int value1 = scanner.nextInt();
        int value2 = scanner.nextInt();
        boolean v12 = (value1 == value2);
        boolean v13 = (value1 != value2);
 /*     boolean value3 = false;
        boolean value4 = true;*/
        if(value1 == value2 && v12!=v13) {
            System.out.println("podane liczby są takie same");//(v12 || v13));
        }else{
            System.out.println("podane liczby nie są takie same"); //(v12 || v13));
        }
            //(value1 == value2));
        /*System.out.println("1 i 3 true: " + (value1 && value3));
        System.out.println("1 lub 2 true: " + (value1 || value2));
        System.out.println("2 lub 4 true: " + (value2 || value4));
        System.out.println("zaprzeczenie 1: " + !value1);
        System.out.println("zaprzeczenie 2: " + !value2);
        System.out.println("zaprzeczenie 1 i 2: " + !(value1 && value2));*/
    }
}
