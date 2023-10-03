package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResource {
    public static void main(String[] args) {
        File input = new File("file/numbers.txt");
        File output = new File("file/outputs.txt");
        try (
                Scanner fileReader = new Scanner(input);
                PrintWriter fileWriter = new PrintWriter(output)
        ) {
            while (fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
