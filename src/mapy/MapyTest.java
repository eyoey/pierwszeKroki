package mapy;

// mapy zawierają wartość oraz unikalny klucz wartości

import java.util.HashMap;
import java.util.Map;

public class MapyTest {

    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1, "Basia");   // dodawanie poprzez put nie add jak w listach i zbiorach
        students.put(2, "Tomek");
        students.put(3, "Basia");
        students.put(2, "Krysia");  // w przypadku innej wartości z tym samym kluczem poprzednia wartość jest nadpisywana



        // pobranie wartości z mapy
        System.out.println(students.get(1));
        System.out.println(students.get(2));  // zwraca Krysie bo Tomek został nadpisany


        Map<Integer,String> otherStudents = new HashMap<>();
        otherStudents.putAll(students);  // do map można dodawać całe inne mapy


        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Paweł"));
        System.out.println(students.isEmpty());
        System.out.println(students.size());

        students.remove(1);  // możliwość usuwania elementów z mapy

        System.out.println(students.size());

        System.out.println("-------------- for 1---------");

        for(Integer key : students.keySet()) {
            System.out.println(key);  // można wypisać klucze
            System.out.println(students.get(key)); // a można wypisac wartosci poprzez get

        }

        System.out.println("-------------- for 2---------");

        for (String student : students.values()) {
            System.out.println(student);
        }

    }


}
