package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        // tworzenie strumienia

        List<String> names = Arrays.asList("Tom","tJohn","Mat", "Paul");

        Stream<String> streamNames = names.stream(); // utworzony strumien do powyzsego
        Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2}).stream();
        DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
        IntStream intStream = IntStream.range(1,100);

        Stream<String> streamNames1 = names.stream();

        //przetwarzanie danych
        // filter - filtrowanie (za pomocą lambdy podajemy warunek ktory musi spelnic element ze strumienia, inaczej jest ignorowany)
        // map - zmiana elementu na cos innego
        // limit - zwraca nam okreslona liczbe elementow
        // peek - pozwala przeprowadzić operacje na każdym elemencie


        //operacje ktore pozwalają na zakończenie strumienia
        // forEach - wykonanie akcji dla każdego z elementów strumienia
        // count - zwróci ilość elementow w strumieniu
        // allMatch - sprawdza czy elementy spełniają jakieś warunki
        // collect - zwraca nowy typ na podstawie strumienia


        List<String> modifiedNames =
        streamNames.filter( el -> el.startsWith("T") || el.startsWith("t"))
                .map(el -> el.toUpperCase())
                .collect(Collectors.toList());
             //   .forEach(el -> System.out.println(el));
        System.out.println(modifiedNames.get(1));
        System.out.println(modifiedNames.size());

        //

        long count = intStream.filter(el -> el>20)
                .map(el -> el*2)
               // .limit(10)
                .count();
        System.out.println(count);
    //.forEach(el -> System.out.println(el));


    }
}
