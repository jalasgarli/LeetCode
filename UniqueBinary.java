// import java.lang.*;

import java.util.HashSet;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<Integer> set = new HashSet<>();
        String binary = "";
        for(int i=0; i<nums[0].length(); i++) {
            binary += "1";
        }
        int number = Integer.parseInt(binary, 2);
        for(int i=0; i<nums.length; i++) {
            int num = Integer.parseInt(nums[i], 2);
            set.add(num);
        }
        int result = 0;
        for(int i=0; i<=number; i++) {
            if(!set.contains(i)) {
                result = i;
                break;
            }
        }
        String binaryString = Integer.toBinaryString(result);
        return binaryString;
    }
}





public class UniqueBinary {
    public static void main(String args[]) {
        Solution solution = new Solution();
        System.out.println(solution.findDifferentBinaryString(new String[]{"01", "00"}));
    }
}
