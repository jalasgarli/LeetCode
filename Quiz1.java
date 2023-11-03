import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        String filePath = "input-9.txt";
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            String numbers = scanner.nextLine();
            String[] array = numbers.split(" ");
            int count = 0;
            for(int i=1; i<array.length-1; i++) {
                int num1 = Integer.valueOf(array[i-1]);
                int num3 = Integer.valueOf(array[i+1]);
                if(num1 % 2 == 0 && num3 %2==0) {
                    count += 1;
                }
            }
            System.out.println(count);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
