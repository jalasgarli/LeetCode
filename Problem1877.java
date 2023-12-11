import java.util.Arrays;

class Solution1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int first = 0;
        int last = nums.length-1;
        int max = 0;
        while (first < last) {
            int check = nums[first] + nums[last];
            max = Math.max(max, check);
            first += 1;
            last -= 1;
        }
        return max;
    }
}

public class Problem1877 {
    public static void main(String[] args) {
        Solution1877 solution1877 = new Solution1877();
        System.out.println(solution1877.minPairSum(new int[]{3,5,4,2,4,6}));
    }
}
