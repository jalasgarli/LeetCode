class Solution2918 {
    public long minSum(int[] nums1, int[] nums2) {
        int zero1 = 0;
        int zero2 = 0;
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<nums1.length; i++) {
            sum1 += nums1[i];
            if(nums1[i] == 0) {
                zero1 += 1;
            }
        }
        for(int i=0; i<nums2.length; i++) {
            sum2 += nums2[i];
            if(nums2[i] == 0) {
                zero2 += 1;
            }
        }
        if(sum2 > sum1 && zero1 >= zero2 && zero2 !=0) {
            return (sum2 + zero2);
        } else if(sum2 > sum1 && zero1 >= zero2 && (sum2-sum1) >= zero1-zero2) {
            return (sum2 + zero2);
        } else if(sum1 >  sum2 && zero1 >= zero2 && zero2 != 0) {
            return (sum1 + zero1);
        } else if(sum1 >  sum2 && zero1 <= zero2 && zero1 !=0) {
            return (sum1 + zero1);
        } else if(sum2 >  sum1 && zero1 <= zero2 && zero1 != 0) {
            return (sum2 + zero2);
        } else if(sum2 == sum1 && zero1 <= zero2 && zero1 != 0) {
            return (sum2 + zero2);
        } else if(sum2 == sum1 && zero1 >= zero2 && zero2 != 0) {
            return (sum1 + zero1);
        } 
        System.out.println(sum1 + " " + zero1);
        System.out.println(sum2 + " " + zero2);
        return -1;
    }
}

public class Problem2918 {
    public static void main(String[] args) {
        int array1[] = {2,17,23,16,2,0,6,12,10};
        int array2[] = {19,11,7,16,0};
        Solution2918 solution2918 = new Solution2918();
        System.out.println(solution2918.minSum(array1, array2));
    }
}
