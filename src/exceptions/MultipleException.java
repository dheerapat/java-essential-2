package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleException {
    public static void main(String[] args) {
        File file = new File("file/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException e) { // can use (FileNotFoundException | InputMismatchException e) instead
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fileReader.close(); // always run
        }
    }
}
