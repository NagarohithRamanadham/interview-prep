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

    public void rotateOptimal(int[][] matrix) {
        //transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for(int j=i;j<matrix.length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for(int i=0;i<matrix.length;i++) {
            int start = 0, end = matrix.length-1;
            while(start<end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }
}
