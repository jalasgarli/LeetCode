import java.util.ArrayList;
import java.util.List;

class Solution2904 {
    public String shortestBeautifulSubstring(String s, int k) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                String binary = s.substring(i, j);
                list1.add(binary);
            }
        }
        for(String binary: list1) {
            int count = 0;
            for(int x=0; x<binary.length(); x++) {
                if(binary.charAt(x) == '1') {
                    count += 1;
                }
            }
            if(count == k) {
                list2.add(binary);
            }
        }
        int min_len = 101;
        for(String binary: list2) {
            if(binary.length() < min_len) {
                min_len = binary.length();
            }
        }
        for(String binary: list2) {
            if(binary.length() == min_len) {
                list3.add(binary);
            }
        }
        if(list3.size() == 1) return list3.get(0);
        System.out.println(list3);
        System.out.println(min_len);
        int min = list3.get(0).compareTo(list3.get(1));
        String result = "";
        for(int i=0; i<list3.size(); i++) {
            for(int j=i+1; j<list3.size(); j++) {
                if(list3.get(i).compareTo(list3.get(j)) < min) {
                    result = list3.get(i);
                }
            }
        }
        return result;
    }
}

public class Problem2904 {
    public static void main(String[] args) {
        Solution2904 solution2904 = new Solution2904();
        System.out.println(solution2904.shortestBeautifulSubstring("000", 1));
    }
}
