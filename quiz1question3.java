import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class quiz1question3 {
    public static void main(String[] args) {
        String filePath = "input.txt";
        try {
            File file = new File(filePath);
            FileInputStream fileInputStream = new FileInputStream(file);
            Scanner scanner = new Scanner(fileInputStream);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] array1 = new int[n][m];
            int[][] array2 = new int[n][m];
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    array1[i][j] = scanner.nextInt();
                }
            }
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    array2[i][j] = scanner.nextInt();
                }
            }
            int sum = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(array2[i][j] == 1) {
                        sum += array1[i][j];
                    }
                }
            }
            System.out.println(sum);
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
