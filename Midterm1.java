import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Midterm1 {
    public static void main(String[] args) {
        String fileName = "input-12.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            long product = 1;
            long mod = 1000000007;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    if (Character.isUpperCase(c)) {
                        int cost = c - 'A' + 1;
                        //System.out.println(cost);
                        product = (product * cost) % mod;
                    }
                }
            }
            System.out.println(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
