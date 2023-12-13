class Solution1582 {
    public boolean checkRow(int[][] array, int i) {
        int count = 0;
        for(int x=0; x < array[0].length; x += 1) {
            if(array[i][x] == 1) {
                count += 1;
            }
        }
        if(count == 1) return true;
        return false;
    }

    public boolean checkColumns(int[][] array, int i) {
        int count = 0;
        for(int x=0; x < array.length; x += 1) {
            if(array[x][i] == 1) {
                count += 1;
            }
        }
        if(count == 1) return true;
        return false;
    }

    public int numSpecial(int[][] mat) {
        int count = 0;

        for(int i = 0; i < mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(checkColumns(mat, j) && checkRow(mat, i) && mat[i][j] == 1) {
                    System.out.println(i + " " + j);
                    count += 1;
                }
            }
        }
        return count;
    }
}

public class Problem1582 {
    public static void main(String[] args) {
        Solution1582 solution1582 = new Solution1582();
        int[][] array = new int[][]{{0,0,1,0},{0,0,0,0}, {0,0,0,0},{0,1,0,0}};
        System.out.println(solution1582.checkColumns(array, 2));
        System.out.println(solution1582.checkRow(array, 0));
         System.out.println(array[0][2]);
        System.out.println(solution1582.numSpecial(array));
    }
}
