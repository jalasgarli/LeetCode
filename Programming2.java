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
            int n = scanner.nextInt();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] array = line.split("\\s+"); 
                for(int i=0; i<array.length; i++) {
                    int count = 0;
                    for(int j=0; j<array[i].length(); i++) {
                        if(array[i].charAt(j) >= 'A' && array[i].charAt(j) <= 'Z') {
                            count += 1;
                        }
                    }
                    if(count == n) {
                        result += 1;
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
