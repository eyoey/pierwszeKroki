package files;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        if(file.createNewFile()) {
            System.out.println("new file created");
        } else {
            System.out.println("file exists");
        }


    }
}
