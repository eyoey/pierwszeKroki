public class PracaDomowa3_LoopsCheck {


    // 1. Wypisz liczby z zakresu 0-100 podzielne przez 3
    // 2. odwróć elementy tablicy [1,3,5] -> [5, 3, 1]

    /*public static void main(String[] args) {
        int numbers = 100;

        for (int i = 1; i <= numbers; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }*/

    public static void main(String[] args) {
        int [] Lotto = new int[] {1,2,3,4,5,6};

        for (int i = 0; (i<Lotto.length/2); i++) {  // <[3] (czyli 4)
            int temp = Lotto[i];
            Lotto[i] = Lotto[Lotto.length - 1 - i]; // =[5]
            Lotto[Lotto.length - 1 - i] = temp; // Lotto[5] = 6 = temp

            System.out.println("iteracja nr: " + i);
        }
        for (int i=0; i<Lotto.length; i++) {

            System.out.println(Lotto[i]);
        }
    }
}