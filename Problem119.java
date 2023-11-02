import java.util.ArrayList;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1); list2.add(1);
        list.add(list1); list.add(list2);
        for(int i=2; i<=rowIndex; i += 1) {
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(1);
            for(int j=0; j<list.get(i-1).size()-1; j++) {
                int num = list.get(i-1).get(j) + list.get(i-1).get(j+1); 
                list3.add(num);
            }
            //System.out.println(list.get(i-1).size());
            list3.add(1);
            list.add(list3);
        }
        return list.get(rowIndex);
    }
}

public class Problem119 {
    public static void main(String[] args) {
        Solution119 solution119 = new Solution119();
        System.out.println(solution119.getRow(3));
    }
}
