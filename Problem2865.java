import java.util.ArrayList;
import java.util.List;

class Solution2865 {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        int max = 0;
        int index = 0;
        long heights[] = new long[maxHeights.size()];
        for(int i=0; i<maxHeights.size(); i++) {
            heights[i] = maxHeights.get(i);
            if(maxHeights.get(i) >= max) {
                max = maxHeights.get(i);
                index = i;
            }
        }
        // 6,5,3,9,2,7
        for(int i=index-1; i>0; i--) {
            if(heights[i] < heights[i-1]) {
                heights[i-1] = heights[i];
            }
        }
        for(int i=index+1; i<heights.length-1; i++) {
            if(heights[i] < heights[i+1]) {
                heights[i+1] = heights[i];
            }
        }
        long sum = 0L;
        for(int i=0; i<heights.length; i++) {
            System.out.print(heights[i] + " ");
            sum += heights[i];
        }
        System.out.println();
        return sum;
    }
}


// import java.util.ArrayList;
// import java.util.List;

// class Solution2865 {
//     public long maximumSumOfHeights(List<Integer> maxHeights) {
//         int max = 0;
//         int index = 0;
//         long heights[] = new long[maxHeights.size()];
        
//         for (int i = 0; i < maxHeights.size(); i++) {
//             heights[i] = maxHeights.get(i);
//             if (maxHeights.get(i) >= max) {
//                 max = maxHeights.get(i);
//                 index = i;
//             }
//         }
        
//         // Adjust heights on the left side of the maximum value.
//         for (int i = index - 1; i >= 0; i--) {
//             if (heights[i] > heights[i + 1]) {
//                 heights[i] = heights[i + 1];
//             }
//         }
        
//         // Adjust heights on the right side of the maximum value.
//         for (int i = index + 1; i < heights.length; i++) {
//             if (heights[i] > heights[i - 1]) {
//                 heights[i] = heights[i - 1];
//             }
//         }
        
//         long sum = 0L;
//         for (int i = 0; i < heights.length; i++) {
//             System.out.print(heights[i] + " ");
//             sum += heights[i];
//         }
//         System.out.println();
//         return sum;
//     }
// }


public class Problem2865 {
    public static void main(String[] args) {
        Solution2865 solution2865 = new Solution2865();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(6);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(solution2865.maximumSumOfHeights(list));
    }
}
