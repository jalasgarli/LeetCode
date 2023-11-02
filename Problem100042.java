import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution100042 {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int array[] = new int[nums.size()];
        for(int i=0; i<array.length; i++) {
            array[i] = nums.get(i);
        }
        Arrays.sort(array);
        int sum = 0;
        int i = 0;
        while (sum != target) {
            sum += array[i];
            i += 1;
        }
        return i;
    }
}

public class Problem100042 {
    public static void main(String[] args) {
        Solution100042 solution100042 = new Solution100042();
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        System.out.println(solution100042.lengthOfLongestSubsequence(list, 7));
    }
}
