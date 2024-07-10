package Package1;

import com.sun.security.jgss.GSSUtil;

public class Zadanie2 {

// sprawdzenie czy wyraz jest palindromem (czytany od przodu lub tyłu jest taki sam, np. kajak

    public static void main(String[] args) {
        System.out.println(isPallindrom("kajak"));
    }



    public static boolean isPallindrom(String word) {
        int n = word.length();
        for (int i = 0; i < n/2; i++) {
            if(word.charAt(i) != word.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }

}
