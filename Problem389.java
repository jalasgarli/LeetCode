import java.util.HashMap;

class Solution389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            mapS.put(s.charAt(i), mapS.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i=0; i<t.length(); i++) {
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);
        }
        System.out.println(mapS);
        System.out.println(mapT);
        for(char ch: mapT.keySet()) {
            if(!mapS.containsKey(ch)) {
                return ch;
            } else {
                if(mapS.get(ch) < mapT.get(ch)) {
                    return ch;
                }
            }
        }
        return ' ';
    }
}


public class Problem389 {
    public static void main(String[] args) {
        Solution389 solution389 = new Solution389();
        System.out.println(solution389.findTheDifference("a", "aa"));
    }
}
