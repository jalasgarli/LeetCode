public class Sample2Functions1 {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int minSum(int a, int b) {
        int min = sumOfDigits(a);
        for(int i=a+1; i<=b; i++) {
            int number = sumOfDigits(i);
            if(min > number) {
                min = number;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n = 77; int m = 777777;
        int count = 0;
        int minNum = minSum(n, m);
        for(int i=n; i<=m; i++) {
            if(sumOfDigits(i) == minNum) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
