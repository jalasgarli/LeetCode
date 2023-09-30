import java.util.HashMap;

class Solution100032 {
    public int minOperations(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int m: map.keySet()) {
            if(map.get(m) < 2) {
                return -1;
            } else if(map.get(m) % 3 == 0) {
                count += (map.get(m)/3);
            } else if((map.get(m)-2) % 3== 0) {
                count += ((map.get(m)-2)/3) + 1;
            } else if((map.get(m)-4) % 3== 0) {
                count += ((map.get(m)-4)/3) + 2;
            }
        }
        return count;
    }
}

public class Problem100032 {
    public static void main(String[] args) {
        Solution100032 solution100032 = new Solution100032();
        int[] nums = {2,1,2,2,3,3};
        System.out.println(solution100032.minOperations(nums));
    }
}
