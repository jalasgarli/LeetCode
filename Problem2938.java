class Solution2938 {
    public long minimumSteps(String s) {
        long result = 0L;
        int zeros = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '0') zeros++;
        }
        int ones = s.length()-zeros;
        if(zeros <= ones) {
            int zero = 0;
            for(int i=0; i<s.length(); i++) { // 101011
                if(s.charAt(i) == '0') {
                    result += (i-zero);
                    zero += 1;
                }
            }
        } else {
            int one = s.length()-1;
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '1') {
                    result += (one - i);
                    one -= 1;
                }
            }
        }
        return result;
    }
}

public class Problem2938 {
    public static void main(String[] args) {
        Solution2938 solution2938 = new Solution2938();
        System.out.println(solution2938.minimumSteps("100"));
    }
}
