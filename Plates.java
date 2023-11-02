import java.util.Stack;

class Solution2055 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int result[] = new int[queries.length];
        for(int i=0; i<queries.length; i++) {
            System.out.println(s.substring(queries[i][0], queries[i][1]+1));
            String str = s.substring(queries[i][0], queries[i][1]+1);
            char[] array = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            for(int x=0; x<array.length; x++) {
                
            }
        }
        return result;
    }
}

public class Plates {
    public static void main(String[] args) {
        int[][] result = {{1,17}, {4,5}, {14,17}, {5,11}, {15,16}};
        Solution2055 solution2055 = new Solution2055();
        String s1= "***|**|*****|**||**|*";
        System.out.println(solution2055.platesBetweenCandles(s1, result));
    }
}
