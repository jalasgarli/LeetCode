
public class quiz2 {
    public static int f(int k, int n) {
        if(k == n) return 1;
        if(k==0) return 1;
        return f(k-1, n-1) + f(k, n-1);
    } 
    public static void main(String[] args) {
        System.out.println(f(3, 7));
    }
}
