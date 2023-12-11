import java.util.Scanner;

public class ProblemX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h, w;
        h = scanner.nextInt();
        w = scanner.nextInt();
        int[][] matrix = new int[h][w];
        char ch = 'A';
        for(int i=0; i<h; i++) {
            for(int j=0; j<w; j++) {
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] == 0) {
                    System.out.print('.');
                } else {
                    char character = (char) (ch + matrix[i][j]-1);
                    System.out.print(character);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
