package Package1;

import java.util.HashMap;
import java.util.Map;

public class Zadanie1 {

// zliczanie wystąpień poszczególnych liczb

    // int[] numbers = new int[] {1,2,3,2,5,3};
    public static void main(String[] args) {
     //  countOccurences(new int[] {1,2,3,2,5,3,3,3,3,3,3}); // wersja z użyciem metody
        int[] numbers = new int[] {1,2,3,2,5,3,3,3,3};

        Map<Integer,Integer> occurences = new HashMap<>();

        for (int i=0; i< numbers.length; i++) {
            if(occurences.containsKey(numbers[i])) {
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i],value+1);
            }else {
                occurences.put(numbers[i],1);
            }
        }

        for(Integer key : occurences.keySet()) {
            System.out.println("liczba " + key + " występuje " + occurences.get(key) + " razy");
        }

        // System.out.println("w mapie jest elementów: " + occurences.size());
    }


// osobna metoda uruchamiana z głównej
/*    public static void countOccurences(int[] numbers) {
        Map<Integer,Integer> occurences = new HashMap<>();
        for (int i=0; i< numbers.length; i++) {
            if(occurences.containsKey(numbers[i])) {
                Integer value = occurences.get(numbers[i]);
                occurences.put(numbers[i],value+1);
            }else {
                occurences.put(numbers[i],1);
            }
        }

        System.out.println("w mapie jest elementów: " + occurences.size());

    }*/


}
