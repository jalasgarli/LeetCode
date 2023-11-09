import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ExamQuestion3 {
    public static void main(String[] args) {
        String filePath = "/Users/javidalasgarli/Desktop/LeetCode/input(10).txt";
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            int n = scanner.nextInt();
            
            int[] array = new int[n];
            for(int i=0; i<n; i++) {
                array[i] = scanner.nextInt();
            }
            double sum = 0;
            for(int i=0; i<n; i++) {
                sum += array[i];
            }
            double arrit = sum/n;

            int count = 0;
            for(int i=0; i<n; i++) {
               if(array[i] > arrit) {
                count++;
               }
            }
            System.out.println(arrit);
            System.out.println(count);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
