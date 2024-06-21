package files;


import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        File file = new File("test.txt");
        if (file.delete()) {
            System.out.println("file deleted");
        } else {
            System.out.println("file not exists");
        }
    }
}
