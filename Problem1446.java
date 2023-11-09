import java.util.List;
import java.util.ArrayList;;

class Solution1446 {
    public int maxPower(String s) {
        List<String> list = new ArrayList<>();
        String str = "" + s.charAt(0);
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) != str.charAt(str.length()-1)) {
                list.add(str);
                str = "";
            }
            str += s.charAt(i);
        }
        list.add(str);
        int max = 0;
        for(int i = 0; i<list.size(); i++) {
            if(list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }
        return max;
    }
}

public class Problem1446 {
    public static void main(String[] args) {
        Solution1446 solution1446 = new Solution1446();
        System.out.println(solution1446.maxPower("abbcccddddeeeeedcba"));
    }
}
