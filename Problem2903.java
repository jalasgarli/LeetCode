
class Solution2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int[] answer = new int[2];
        answer[0] = -1; answer[1] = -1;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(Math.abs(j-i) >= indexDifference && Math.abs((nums[i]-nums[j]))>= valueDifference) {
                    answer[0] = i; answer[1] = j;
                    System.out.println(answer[0] + " " + answer[1]);
                    return answer;
                }
            }
        }
        System.out.println(answer[0] + " " + answer[1]);
        return answer;
    }
}

public class Problem2903 {
    public static void main(String[] args) {
        Solution2903 solution2903 = new Solution2903();
        System.out.println(solution2903.findIndices((new int[]{2,1}), 0, 0));
    }
}
