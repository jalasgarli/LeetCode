import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String filePath = "/Users/javidalasgarli/Downloads/input-3.txt"; // Specify the path to your file here
        try {
            int minOfMaxElements = findMinOfMaxElementsFromFile(filePath);
            System.out.println("Minimum among the maximum elements: " + minOfMaxElements);
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    public static int findMinOfMaxElementsFromFile(String filePath) throws IOException {
        List<List<Integer>> matrix = new ArrayList<>();

        // Read the matrix from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(" ");
                List<Integer> row = new ArrayList<>();
                for (String element : elements) {
                    row.add(Integer.parseInt(element));
                }
                matrix.add(row);
            }
        }

        // Initialize a list to store the maximum elements of each row
        List<Integer> maxElements = new ArrayList<>();

        // Find the maximum element in each row
        for (List<Integer> row : matrix) {
            int maxInRow = row.stream().mapToInt(Integer::intValue).max().orElse(0);
            maxElements.add(maxInRow);
        }

        // Find the minimum among the maximum elements
        int minOfMaxElements = maxElements.stream().mapToInt(Integer::intValue).min().orElse(0);

        return minOfMaxElements;
    }
}