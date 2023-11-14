

class Solution1930 {
    public int countPalindromicSubsequence(String s) {
        int max = 0;
        for(char i='a'; i<='z'; i++) {
            int number1 = s.indexOf(i);
            int number2 = s.lastIndexOf(i);
            if(number2 - number1 >= 2) {
                String sub = s.substring(number1+1, number2);
                for(char j='a'; j<='z'; j++) {
                    String str = j+"";
                    if(sub.contains(str)) {
                        max += 1;
                    }
                }
            }
        }
        return max;
    }
}

public class Problem1930 {
    public static void main(String[] args) {
        Solution1930 solution1930 = new Solution1930();
        System.out.println(solution1930.countPalindromicSubsequence("uuuuu"));

        // aba aaa aca bbb bab bcb cac cbc
    }
}
