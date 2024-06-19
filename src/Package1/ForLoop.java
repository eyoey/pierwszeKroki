package Package1;

public class ForLoop {

    public static void main(String[] args) {

      /*  // i - specjalna zmienna sterująca (mowi kiedy przerwac)
        for (int i = 0; i < 100; i = i + 2) {
            System.out.println(i);
        }*/

       // i - specjalna zmienna sterująca (mowi kiedy przerwac)
        for (int i = 0; i < 101;i++) {
            if(i%5==1)
                System.out.println(i);
        }
/*
        for (int j = 0; j < 100;j++) {
            System.out.println("Będę robił prace domowe");
        }*/
    }
}
