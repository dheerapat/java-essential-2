package exceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RethrowException {
    public static void main(String[] args) throws IOException {
        rethrowException();
    }
    public static void rethrowException() throws IOException {
        File file = new File("nonexistence/file.txt");
        file.createNewFile(); // this will error outside try block but we rethrow it

        Scanner fileReader = new Scanner(file); // this is ok because FileNotFoundException is inherited from IOException class
    }
}
