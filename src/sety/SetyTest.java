package sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {

    // sety (zbiory) nie przyjmują duplikatów
    // przejście po elementach zbioru tylko 1 sposobem bo nie ma indeksow jak np w listach

    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");

        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());
        System.out.println(fruits.isEmpty());

        System.out.println("--------------------");

        Set<String> vege = new HashSet<>();
        vege.add("Potatoes");
        vege.add("onion");
        vege.addAll(fruits); // jak w listach można dodawać od razu cale zbiory

        System.out.println(vege.size());

        System.out.println("--------------------");

        // przejście po elementach zbioru tylko 1 sposobem bo nie ma indeksow jak np w listach

        for(String fruit : fruits) {
            System.out.println(fruit);
        }




    }
}
