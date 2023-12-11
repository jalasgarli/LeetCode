import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class  Quiz3Problem {
    public static void main(String[] args) {
        String filePath = "/Users/javidalasgarli/Desktop/LeetCode/input-12.txt";
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            int numbers = scanner.nextInt();
            int k = scanner.nextInt();
            int count = 0;
            int array[] = new int[numbers];
            for(int i=0; i<numbers; i++) {
                array[i] = scanner.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[k-1]);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
