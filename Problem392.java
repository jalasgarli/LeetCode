class Solution392 {
    public boolean isSubsequence(String s, String t) {
        String result = "";
        int i = 0; int j = 0;
        while (i < s.length() && j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                result += s.charAt(i);
                i += 1;
            }
            j += 1;
        }
        return result.equals(s);
    }
}

public class Problem392 {
    public static void main(String[] args) {
        Solution392 solution392 = new Solution392();
        System.out.println(solution392.isSubsequence("acb", "ahbgdc"));
    }
}
