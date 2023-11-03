public class Sample2Functions2 {
    public static int f(int n) {
        if(n==0) return 0;
        return f(n-1)+n;
    }
    public static void main(String[] args) {
        System.out.println(f(432));
    }
}
