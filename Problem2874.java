class Solution2874 {
    public long maximumTripletValue(int[] nums) {
        int a=0, b=1, c=nums.length-1;
        boolean whatever = true;
        long max = 0L;
        while (a < c) {
            if(b < c && b > a) {
                long score = (nums[a]-nums[b]) * nums[c];
                if(score > max) {
                    max = score;
                }
                b += 1;
            } 
            if(whatever && (b >= c || b <=a)) {
                a += 1;
                b = a+1;
                whatever = false;
            } else if(!whatever && (b >= c || b <=a)){
                c -= 1;
                b = a+1;
                whatever = true;
            }
        }
        
        return max;
    }
}

public class Problem2874 {
    public static void main(String[] args) {
        Solution2874 solution2874 = new Solution2874();
        System.out.println(solution2874.maximumTripletValue(new int[]{1,2,3}));
    }
}
