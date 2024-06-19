package Package1;

// przy final brak możliwości nadpisania wartości zmiennej, dziedziczenia z klasy final itp..

public class finalTest {

    public static void main(String[] args) {
        final int x = 2;


        final Person person = new Person("Tom", 23);
        person.age = 33;


    }

}
