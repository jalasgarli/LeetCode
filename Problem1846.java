import java.util.Arrays;

class Solution1846 {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        if(arr[0] != 1) arr[0] = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i]-arr[i-1] > 1) {
                arr[i] = arr[i-1]+1;
            }
        } 
        return (arr[arr.length-1]);
    }
}

// 2 3 4 7

public class Problem1846 {
    public static void main(String[] args) {
        Solution1846 solution1846 = new Solution1846();
        System.out.println(solution1846.maximumElementAfterDecrementingAndRearranging(new int[]{1,2,3,4,5}));
    }
}
