package by.epam.preTraining.harshunou.utils.filework;

import by.epam.preTraining.harshunou.exceptions.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileWorker {

    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine().trim();
                result = result.append(nextLine);
            }
        } catch (IOException e) {
           throw new FileNotFoundException("File is not found or corrupted");
        }
        return result.toString().trim();
    }


}
