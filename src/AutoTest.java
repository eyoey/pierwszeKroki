public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 123450;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A3";
        audi.rok = 2000;
        audi.przebieg = 250000;

        audi.info();

        Auto noName = new Auto();

        noName.info();


    }
}
