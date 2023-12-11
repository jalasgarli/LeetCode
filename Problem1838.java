class Solution1838 {
    public int maxFrequency(int[] nums, int k) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=1+i; j<nums.length; j++) {
                if(nums[j] - nums[i] < k) {
                    max = Math.max(max, (nums[j] - nums[i]));
                }
            }
        }
        return max;
    }
}

public class Problem1838 {
    public static void main(String[] args) {
        Solution1838 solution1838 = new Solution1838();
        System.out.println(solution1838.maxFrequency(new int[]{1,2,4}, 5));
    }
}
