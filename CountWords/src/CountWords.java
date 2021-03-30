import java.io.File;
import java.util.Scanner;

public class CountWords {
    public static void main(String [] args) throws Exception {
        File file = new File("taleof TwoCities.txt");
        Scanner scanner = new Scanner(file);

        int wordcounts = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            wordcounts += line.split(" ").length;
        }
        System.out.println("The file contains: " + wordcounts + " words.");
    }
}
