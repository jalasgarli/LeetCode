import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution2895 {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int half = tasks.size()/processorTime.size();
        Collections.sort(tasks);
        Collections.sort(processorTime, Collections.reverseOrder());
        for(int i:tasks) {
            System.out.println(i);
        }
        System.out.println("-----------");
        for(int i:processorTime) {
            System.out.println(i);
        }
        System.out.println("-----------");
        int time = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i=0; i<tasks.size(); i++) {
            max = Math.max(max, (tasks.get(i) + processorTime.get(time)));
            count += 1;
            if(count == half) {
                count = 0;
                time += 1;
            }
        }

        return max;
    }
}

public class Problem2895 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10); list1.add(20);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2); list2.add(3); list2.add(1); list2.add(2);
        list2.add(5); list2.add(8); list2.add(4); list2.add(3);

        Solution2895 solution2895 = new Solution2895();
        System.out.println(solution2895.minProcessingTime(list1, list2));
    }
}
