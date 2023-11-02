class Solution2 {
    public boolean checkSymmetry(int n) {
        String number = String.valueOf(n);
        int j = number.length()-1;
        for(int i=0; i<n/number.length()/2; i++) {
            if(number.charAt(i) != number.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high; i++) {
            if(checkSymmetry(i)) count++;
        }
        return count;
    }
}

public class Problem2843 {
    public static void main(String[] args) {
        Solution2 solution2843 = new Solution2();
        System.out.println(solution2843.countSymmetricIntegers(1, 100));
    }
}
