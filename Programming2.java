import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programming2 {
    public static void main(String[] args) {
        String filePath = "input2.txt";

        try {
            File file = new File(filePath);
            FileInputStream fileInputStream =new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            int result = 0;
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                for(int i=0; i<line.length(); i++) {
                    if(line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                        int number = line.charAt(i) - '0';
                        result += number;
                    }
                }
            }
            System.out.println(result);
            scanner.close();
        } catch(FileNotFoundException exception) {
            System.out.println("File not found");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
