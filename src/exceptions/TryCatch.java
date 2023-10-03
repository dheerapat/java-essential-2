package exceptions;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        File file = new File("resource/non/existent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) { // can use Exception superclass
            System.out.println("Sorry, error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
