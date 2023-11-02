import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("/Users/javidalasgarli/Downloads/input-4.txt")); // Input file
            PrintWriter writer = new PrintWriter("output.txt"); // Output file

            // Read the length of the array
            int n = fileScanner.nextInt();

            // Read the array of integers
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fileScanner.nextInt();
            }

            // Calculate the sum of elements and find the minimum element
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (arr[i] < min) {
                    min = arr[i];
                }
            }

            // Calculate the difference between the sum and the minimum element
            int difference = sum - min;

            // Write the result to the output file
            System.out.println(difference);
            // Close the input and output files
            fileScanner.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}