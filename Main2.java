class Solution2 {
    public int integerBreak(int n) {
        if(n == 2) return 1;
        if(n == 3) return 2;
        if(n%3==0) {
            return (int)Math.pow(3, (n/3));
        } else if(n%3==1) {
            return (int)Math.pow(3, (n/3-1))*4;
        }
        return (int)Math.pow(3, (n/3)-2)*16;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.integerBreak(5));
    }
}
