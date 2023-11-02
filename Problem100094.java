import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution100094 {
    public int checkDistinct(List<Integer> list) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i), 0)+1);
        }
        return map.size();
    }
    public int sumCounts(List<Integer> nums) {
        int sum = 0;
        for(int i=0; i<nums.size(); i++) {
            for(int j=i+1; j<=nums.size(); j++) {
                
                sum += (checkDistinct(nums.subList(i, j)) * checkDistinct(nums.subList(i, j)));
                System.out.println((checkDistinct(nums.subList(i, j)) * checkDistinct(nums.subList(i, j))));
            }
        }
        return sum;
    }
}
public class Problem100094 {
    public static void main(String[] args) {
        Solution100094 solution100094 = new Solution100094();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        //list.add(2);
        list.add(1);
        System.out.println(solution100094.sumCounts(list));
    }
}
