import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class quiz1question2 {
    public static void main(String[] args) {
        String filePath = "/Users/javidalasgarli/Desktop/LeetCode/input-11.txt";
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            int n = scanner.nextInt();
            int[] array = new int[n];
            for(int i=0; i<n; i++) {
                array[i] = scanner.nextInt();
            }
            int count = 0;
            for(int i=0; i<array.length; i++) {
                if(array[i] < 0) {
                    count += 1;
                    //System.out.println(array[i]);
                }
            }
            System.out.println(count);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
