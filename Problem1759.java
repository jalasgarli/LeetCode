import java.util.ArrayList;

class Solution1759 {
    public int function(int n) {
        if(n == 1) return 1;
        if(n == 2) return 3;
        if(n == 3) return 6;
        return function(n-1) + n; 
    }
    public int countHomogenous(String s) {
        ArrayList<String> list = new ArrayList<>();
        String str = "" + s.charAt(0);
        for(int i=1; i<s.length(); i++) {
            if(str.charAt(str.length()-1) != s.charAt(i)) {
                list.add(str);
                str = "";
            }
            str += s.charAt(i);
        }
        list.add(str);
        int count = 0;
        for(int i=0; i<list.size(); i++) {
            count +=  function(list.get(i).length());
        }
        return count;
    }

}

public class Problem1759 {
    public static void main(String[] args) {
        Solution1759 solution1759 = new Solution1759();
        System.out.println(solution1759.countHomogenous("xy"));

    }
}
