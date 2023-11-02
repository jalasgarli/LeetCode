import java.util.Arrays;

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(arr); Arrays.sort(target);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != target[i]) {
                return false;
            }
        }
        return true;
    }
}

public class Problem1460 {
    public static void main(String[] args) {
        
    }
}
