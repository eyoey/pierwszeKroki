package Package1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {


    public static void main(String[] args) {

        try {
            System.out.println("before reading file");
            readFile("C:\\Users\\apawelec\\Documents\\mta\\src\\Package1\\test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Wyjątek został wyrzucony");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Closing file");
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(path);
    }

}
