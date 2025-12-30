package arrays.medium;

public class Rotate48 {
    public void rotate(int[][] matrix) {
        int[][] ans = new int[matrix.length][];

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                ans[i][j] = matrix[matrix.length-1-j][i];
            }
        }

        System.arraycopy(ans, 0, matrix, 0, matrix.length);
    }
}
