import java.util.ArrayList;
import java.util.List;

class Solution2062 {
    public int countVowelSubstrings(String word) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(int i=0; i<word.length(); i++) {
            for(int j=i+1; j<=word.length(); j++) {
                String s = word.substring(i, j);
                if(s.length() >= 5 && s.contains("a") && s.contains("e") && 
                    s.contains("i") && s.contains("o") && s.contains("u")) {
                        list.add(s);
                    }
            }
        }
        for(int i=0; i<list.size(); i++) {
            String s = list.get(i);
            boolean check = true;
            for(int j=0; j<s.length(); j++) {
                if(s.charAt(j) != 'a' && s.charAt(j) != 'i' && s.charAt(j) != 'e' &&
                s.charAt(j) != 'o' && s.charAt(j) != 'u') {
                    check = false;
                }
            }
            if(check) {
                list2.add(s);
            }
        }
        return list2.size();
    }
}


public class Problem2062 {
    public static void main(String[] args) {
        Solution2062 solution2062 = new Solution2062();
        System.out.println(solution2062.countVowelSubstrings("aeiouu"));
    }
}
