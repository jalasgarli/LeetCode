import java.util.ArrayList;
import java.util.List;

class Solution2221 {
    public int triangularSum(int[] nums) {
        //if(nums.length == 1) return nums[0]%10;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            list1.add(nums[i]);
        }
        list.add(list1);
        for(int i=1; i<nums.length; i++) {
            List<Integer> list2 = new ArrayList<>();
            for(int j=0; j<list.get(i-1).size()-1; j++){
                int number = (list.get(i-1).get(j) + list.get(i-1).get(j+1))%10;
                list2.add(number);
            }
            list.add(list2);

        }
        return list.get(nums.length-1).get(0);
    }
}

public class Problem2221 {
    public static void main(String[] args) {
        Solution2221 solution2221 = new Solution2221();
        System.out.println(solution2221.triangularSum(new int[]{5}));
    }
}
