package by.epam.preTraining.harshunou.utils.filework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileWorker {

    public static String readFile(String path) throws FileNotFoundException {
        StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(new FileReader(path))) {
            while (scanner.hasNextLine()) {
                String nextLine = scanner.nextLine().trim();
                result = result.append(nextLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result.toString().trim();
    }


}
