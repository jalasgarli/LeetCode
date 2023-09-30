import java.util.ArrayList;
import java.util.List;;

class Solution8038 {
    public int minOperations(List<Integer> nums, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int len = nums.size()-1;
        for(int i=len; i>=0; i--) {
            int number = nums.get(i);
            if(!list.contains(number) && number <= k) {
                list.add(number);
            }
            result.add(number);
            if(list.size() == k) {
                break;
            }
        }
        System.out.println(list);
        System.out.println(result);
        return result.size();
    }
}

public class Problem8038 {
    public static void main(String[] args) {
        Solution8038 solution8038 = new Solution8038();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(1);
        System.out.println(solution8038.minOperations(list, 3));
    }
}
