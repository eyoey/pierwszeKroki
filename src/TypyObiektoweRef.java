public class TypyObiektoweRef {
    public  void main(String[] args) {

        // liczby stałoprzecinkowe
        Byte firstNumber = 127;         // 1 bajt od -128 do 127
        Short secondNumber = 32689;     // 2 bajty od -32768 do 32767]
        Integer thirdNumber = 32768999;     // 4 bajty od -2 147 483 648 do 2 147 483 647
        Long fourthNumber = 2148000L;   // 8 bajtów od -2^63 do (2^63)-1

        // liczby zmiennoprzecinkowe
        Float fifthNumber = 4.99943F;   // 4 bajty max 6-7 liczb po przecinku
        Double sixNumber = 3.99999999D; // 8 bajtów max ok 15 cyfr po przecinku

        //wartość logiczna
        Boolean prawda = true;
        Boolean falsz = false;

        //pojedynczy znak
        Character letter = 'A';

        //ciagi znakow
        String hello = "Hello Hello";
    }
}
