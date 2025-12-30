package arrays.medium;

public class SetMatrix73 {
    public void setZeroes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(!visited[i][j] && matrix[i][j]==0) {
                    for (int k = 0; k < matrix.length; k++) {
                        if (matrix[k][j] != 0) {
                            matrix[k][j] = 0;
                            visited[k][j] = true;
                        }
                    }
                    for (int k = 0; k < matrix[i].length; k++) {
                        if (matrix[i][k] != 0) {
                            matrix[i][k] = 0;
                            visited[i][k] = true;
                        }
                    }
                }
                visited[i][j] = true;
            }
        }
    }
}
