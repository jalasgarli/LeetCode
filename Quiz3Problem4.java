import java.util.Scanner;

public class Quiz3Problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Prime factorization of " + number + ":");
        primeFactorization(number);
    }

    // Function to find and print the prime factorization of a number
    static void primeFactorization(int n) {
        if (n <= 1) {
            System.out.println("Prime factorization is not defined for numbers less than or equal to 1.");
            return;
        }

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.print(count);
        if (n > 1) {
            System.out.print(n);

        }
    }
}
