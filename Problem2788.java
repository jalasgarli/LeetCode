import java.util.ArrayList;
import java.util.List;

class Solution2788 {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<words.size(); i++) {
            String str = "";
            String word = words.get(i);
            for(int j=0; j<word.length(); j++) {
                if(word.charAt(j) == separator && !str.equals("")) {
                    list.add(str);
                    str = "";
                } else if(word.charAt(j) != separator) {
                    str = str + word.charAt(j);
                }
            }
            if(!str.equals("")) {
                    list.add(str);
            }
        }
        return list;
    }
}

public class Problem2788 {
    public static void main(String[] args) {
        Solution2788 solution2788 = new Solution2788();
         List<String> list = new ArrayList<>();
         list.add("$problem$");
         list.add("$easy$");
         //list.add("six");
        System.out.println(solution2788.splitWordsBySeparator(list, '$'));
    }
}
