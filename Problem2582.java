class Solution2582 {
    public int passThePillow(int n, int time) {
        int result = 1;
        boolean check = true;
        for(int i=1; i<=time; i++) {
            if(result == n) {
                check = false;
            } 
            if(result == 1) {
                check = true;
            }
            if(check) {
                result += 1;
            } else {
                result -= 1;
            }
        }
        return result;
    }
}

public class Problem2582 {
    public static void main(String[] args) {
        Solution2582 solution2582 = new Solution2582();
        System.out.println(solution2582.passThePillow(3, 2));
    }
}
