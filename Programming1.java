import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Programming1 {
    public static void main(String[] args) {
        // Specify the file path for the input file.
        String filePath = "/Users/javidalasgarli/Desktop/LeetCode/input-6.txt";

        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);

            int result = 0;
            int i = 1;
            while (scanner.hasNext()) {
                String firstValue = scanner.next();
                int secondValue = scanner.nextInt();
                if (firstValue.equals("add")) {
                    result += secondValue;
                } else if (firstValue.equals("subtract")) {
                    result -= secondValue;
                } else if (firstValue.equals("multiply")) {
                    result *= secondValue;
                }
                System.out.println(i + ". " + result);
                i++;
            }
            System.out.println("-------");
            System.out.println(result);

            // Close the scanner and the file input stream.
            scanner.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
