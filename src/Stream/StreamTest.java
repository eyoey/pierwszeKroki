package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia

        List<String> names = Arrays.asList("Tom","John","Mat", "Paul");

        Stream<String> streamNames = names.stream();
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        Stream<String> streamNames1 = names.stream();

        // przetwarzanie danych
        // filter - filtrowanie
        // map - zmiana elementu na cos innego
        // limit - zwraca nam okreslona liczbe elementow
        // peek - pozwala przeprowadzić operacje na każdym elemencie


        // forEach - wykonanie akcji dla każdego z elementów strumienia
        // count - zwróci ilość elementow w strumieniu
        // allMatch - sprawdza czy elementy spełniają jakieś warunki
        // collect - zwraca nowy typ na podstawie strumienia





    }
}
