import java.util.Stack;

class Solution1963 {
    public int minSwaps(String s) {
        Stack<Character> stack = new Stack<>();
        // ]]][[[
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '[') {
                stack.add(s.charAt(i));
            } else {
                if(stack.isEmpty() == false && stack.peek() == '[') {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }
        }
        System.out.println(stack.size()/2);
        return 0;
    }
}

public class Problem1963 {
    public static void main(String[] args) {
        Solution1963 solution1963 = new Solution1963();
        System.out.println(solution1963.minSwaps("]]][[["));
    }
}
