class Solution1422 {
    public int countZeros(String binary) {
        int count = 0;
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '0') count += 1;
        }
        return count;
    }
    public int countOnes(String binary) {
        int count = 0;
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') count += 1;
        }
        return count;
    }
    public int maxScore(String s) {
        int max = 0;
       for(int i=1; i<s.length(); i++) {
            String zero = s.substring(0, i);
            String one = s.substring(i);
            int result = countZeros(zero) + countOnes(one);
            if(result > max) {
                max = result;
            }
       }
       return max; 
    }
}

public class Problem1422 {
    public static void main(String[] args) {
        Solution1422 solution1422 = new Solution1422();
        System.out.println(solution1422.maxScore("111"));
    }
}
