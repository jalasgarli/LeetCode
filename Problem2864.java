class Solution2864 {
    public boolean checkOnes(int number, String binary) {
        int count = 0;
        for(int i=0; i<binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                count += 1;
            }
        }
        return count == number;
    }
    public String maximumOddBinaryNumber(String s) {
        int numberOfOnes = 0;
        int len = s.length();
        String ss = "";
        for(int i=0; i<len; i++) {
            ss += "1";
        }
        int number = Integer.parseInt(ss, 2);
        System.out.println(number);
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '1') numberOfOnes++;
        }
        String result = "";
        for(int i=1; i<=number; i+=2) {
            if(i%2!=0 && checkOnes(numberOfOnes, Integer.toBinaryString(i))) {
                result = Integer.toBinaryString(i);
            }
        }
        return result;
    }
}

public class Problem2864 {
    public static void main(String[] args) {
        Solution2864 solution2864 = new Solution2864();
        System.out.println(solution2864.maximumOddBinaryNumber("0101"));
    }
}
