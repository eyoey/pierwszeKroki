public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 123450;

       /* mercedes.jedz();
        mercedes.hamuj();*/
        mercedes.info();

        System.out.println("");


        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A3";
        audi.rok = 2000;
        audi.przebieg = 250000;

        audi.info();

        System.out.println("");

        Auto newauto = new Auto("volvo", "v40", 2000, 1234);
        System.out.println(newauto.marka);
        System.out.println(newauto.model);
        System.out.println(newauto.rok);
        System.out.println(newauto.przebieg);

        System.out.println("");

        Auto newauto2 = new Auto("merc", "A", 2002, 222222);
        System.out.println(newauto2.marka);
        System.out.println(newauto2.model);
        System.out.println(newauto2.rok);
        System.out.println(newauto2.przebieg);



/*        Auto noName = new Auto();
        noName.info();*/


    }
}
