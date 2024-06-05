public class MetodyRef {

    public void nazwa() {
        int result = 0;
        for(int i=0;i<100;i++) {
            result = result +1;
        }
        System.out.println("Wartość to: " + result);
    }

    public void sum() {
        int number1 = 0;
        int number2 = 2;
        System.out.println("Suma to: " + (number1+number2));
    }

    public String imie() {
        System.out.println("Mam na imię Tomek");
        return "Tomek";
    }
}