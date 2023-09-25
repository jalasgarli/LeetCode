import java.util.HashMap;
import java.util.HashSet;

class Solution318 {
    public boolean checkCommonLetters(String word) {
        HashSet<Character> characters = new HashSet<>();
        for(int i=0; i<word.length(); i++) {
            characters.add(word.charAt(i));
        }
        return word.length() == characters.size();
    }
    public int maxProduct(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++) {
            for(int j=i+1; j<words.length; j++) {
                String newString = words[i] + words[j];
                int num = words[i].length() * words[j].length();
                map.put(newString, num);
            }
        }
        int max = 0;
        for(String word: map.keySet()) {
            if(max <= map.get(word) && checkCommonLetters(word)) {
                System.out.println(word);
                max = map.get(word);
            }
        }
        return max;
    }
}

public class Problem318 {
    public static void main(String[] args) {
        Solution318 solution318 = new Solution318();
        String words[] = {"a","ab","abc","d","cd","bcd","abcd"};
        System.out.println(solution318.maxProduct(words));
    }
}
