class Solution2873 {
    public long maximumTripletValue(int[] nums) {
        long result = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    long currentResult = (long)(nums[i]-nums[j]) * nums[k];
                    result = Math.max(result, currentResult);
                }
            }
        }
        return result;
    }
}

public class Problem2873 {
    public static void main(String[] args) {
        Solution2873 solution2873 = new Solution2873();
        System.out.println(solution2873.maximumTripletValue(new int[]{1000000,1,1000000}));
    }
}
