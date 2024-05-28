public class OperatoryLogiczneRef {

    public static void main(String[] args) {
        boolean value1 = true;
        boolean value2 = false;
        boolean value3 = false;
        boolean value4 = true;

        // && -> true wtedy gdy wyrażenia składowe = true
        // || -> true wtedy gdy jedno wyrażenie składowe = true
        // ! (negacja) - zwraca wartość przeciwną do wyrażenia przed którym się znajduje

        System.out.println(value1 && value2);
        System.out.println(value1 && value3);
        System.out.println(value1 || value2);
        System.out.println(value2 || value4);
        System.out.println(!value1);
        System.out.println(!value2);
        System.out.println(!(value1 && value2));
    }
}
