package listy;

import document.PdfDocument;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsTest {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Paweł");
        names.add("Kasia");
        names.add("Ola");
        names.add("Paweł");


/*        System.out.println(names.get(1));
        System.out.println(names.indexOf("Paweł"));
        System.out.println(names.lastIndexOf("Paweł"));
        System.out.println(names.contains("Krystyna"));
        System.out.println(names.size());
        System.out.println(names.isEmpty());

        System.out.println("------------ oddzielenie list --------------");

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(2));
        System.out.println(numbers.lastIndexOf(2));
        System.out.println(numbers.contains(5));
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());

        System.out.println("------------ oddzielenie list --------------");

        List<String> diffNames = new ArrayList<>();
        diffNames.addAll(names);  // lista bedzie zawierała wszystkie elementy ze wskazanej listy

        System.out.println("------------ oddzielenie list --------------");

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());*/

        // przejście po elementach listy (2 sposoby)
        for(int i=0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println("Oddzielenie petli");

        for(String name : names) {
            System.out.println(name);
        }


    }



}


