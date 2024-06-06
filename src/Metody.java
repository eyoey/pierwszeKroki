public class Metody {

    public void countAmount() {
        System.out.println("treść komunikatu");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);

        }

    public int receiveAmount() {
        System.out.println("treść komunikatu");
        int result = 0;
        for (int i = 0; i < 100; i++) {
            result = result + i;
        }
        //System.out.println("Wynik to: " + result);
        return result;
    }

    public void countAmountParam(int number) {
        System.out.println("number ma wartość " + number);
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Wynik to: " + result);

    }


    public int add(int number1, int number2) {
//        System.out.println("suma liczb to: " + (number1+number2));
        return number1+number2;
    }
}