import java.util.Stack;

class Solution946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i=0, j=0;
        while(i < pushed.length && j<popped.length) {
            if(stack.isEmpty() == false && stack.peek() == popped[j]) {
                stack.pop();
                j += 1;
            } else {
                stack.push(pushed[i]);
                i += 1;
            }
        }
        for( ; j<popped.length; ) {
            if(stack.isEmpty() == false && stack.peek() == popped[j]) {
                stack.pop();
                j += 1;
            }
        }
        System.out.println(stack);
        return true;
    }
}

public class Problem1963 {
    public static void main(String[] args) {
        Solution946 solution1963 = new Solution946();
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        System.out.println(solution1963.validateStackSequences(pushed, popped));
    }
}
