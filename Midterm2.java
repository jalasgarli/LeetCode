public class Midterm2 {
    public static int f(int n) {
        if(n < 0) return 0;
        if(n == 0) return 2;
        //System.out.println((f(n-1) + 4*f(n-2)+1));
        return (f(n-1) + 4*f(n-2)+1);
    }
    public static void main(String[] args) {
        System.out.println(f(6));
    }
}
