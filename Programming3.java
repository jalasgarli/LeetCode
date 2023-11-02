import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Programming3 {
    public static void main(String[] args) {
        // Define input and output file paths.
        String inputFilePath = "input-8.txt";

        try {
            Scanner scanner = new Scanner(new File(inputFilePath));
            //FileWriter writer = new FileWriter(outputFilePath);

            while (scanner.hasNext()) {
                String expression = scanner.next();
                int result = evaluateExpression(expression);
                System.out.println(result);
            }

            // Close the input and output files.
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int evaluateExpression(String expression) {
        String[] terms = expression.split("[+-]");
        int result = 0;
        char operator = '+';

        for (String term : terms) {
            if (term.isEmpty()) {
                continue;
            }

            int value = Integer.parseInt(term);
            if (operator == '+') {
                result += value;
            } else {
                result -= value;
            }

            if (expression.indexOf('+') != -1) {
                operator = '+';
            } else {
                operator = '-';
            }
        }

        return result;
    }
}
