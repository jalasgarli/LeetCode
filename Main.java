import java.util.Arrays;
import java.util.HashMap;

class Solution1 {
    public boolean checkMap(HashMap<Character, Integer> map) {
        int result = 0;
        for(char m: map.keySet()) {
            result += map.get(m);
        }
        return result == 0;
    }
    public String StringSmallToLarge(HashMap<Character, Integer> map) {
        String result1 = "";
        String result = "";
        for(char m: map.keySet()) {
            if(map.get(m) != 0) {
                result1 += m;
            }
        }
        char[] array = result1.toCharArray();
        Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
            result += array[i];
        }
        return result;
    }
    public String StringLargeToSmall(HashMap<Character, Integer> map) {
        String result1 = "";
        String result = "";
        for(char m: map.keySet()) {
            if(map.get(m) != 0) {
                result1 += m;
            }
        }
        char[] array = result1.toCharArray();
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--) {
            result += array[i];
        }
        return result;
    }
    public String sortString(String s) {
        char[] array = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0)+1);
        }
        String result = "";
        String str = "";
        for(char ch: map.keySet()) {
            str += ch;
        }
        while (!checkMap(map)) {
            String smallToLarge = StringSmallToLarge(map);
            char[] array1 = smallToLarge.toCharArray();
            for(int i=0; i<array1.length; i++) {
                result += array1[i];
                int number = map.get(array1[i]);
                number -= 1;
                map.replace(array1[i], number);
            }
            String largeToSmall = StringLargeToSmall(map);
            char[] array2 = largeToSmall.toCharArray();
            for(int i=0; i<array2.length; i++) {
                result += array2[i];
                int number = map.get(array2[i]);
                number -= 1;
                map.replace(array2[i], number);
            }
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.sortString("leetcode"));
    }
}