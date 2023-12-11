import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution2195 {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long sum = 0L;
        long max = nums[nums.length-1];
        Set<Integer> list = new HashSet<>();
        int j= 0;
        for(int num: nums) {
            list.add(num);
        }
        for(int i=1; i<=max; i++) {
            if(!list.contains(i) && j<k) {
                list.add(i);
                sum += i;
                j += 1;
            }
        }
        for(; j<k; j++) {
            sum += ++max;
        }
        System.out.println(list);
        return sum;
    }
}

public class Problem2195 {
    public static void main(String[] args) {
        Solution2195 solution2195 = new Solution2195();
        int[] nums = {1,4,25,10,25};
        System.out.println(solution2195.minimalKSum(nums, 2));
    }
}
