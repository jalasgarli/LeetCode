import java.util.ArrayList;
import java.util.List;



class Solution1513 {
    public int function(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(n == 3) return 6;
        return (function(n-1) + n)%1000000007;
    }
    public int numSub(String s) {
        List<String> list = new ArrayList<>();
        String str = s.charAt(0) + "";
        for(int i=1; i<s.length(); i++) {
            if(str.charAt(str.length() - 1) != s.charAt(i)) {
                if(str.contains("1")) {
                    list.add(str);
                }
                str = "";
            }
            str += s.charAt(i);
        }
        if(str.contains("1")) {
            list.add(str);
        }
        int count = 0;
        for(int i=0; i<list.size(); i++) {
            count += function(list.get(i).length())%1000000007;
        }
        return count;
    }
}

public class Problem1513 {
    public static void main(String[] args) {
        Solution1513 solution1513 = new Solution1513();
        System.out.println(solution1513.numSub("111111"));
    }
}
