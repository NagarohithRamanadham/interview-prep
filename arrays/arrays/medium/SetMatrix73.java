package arrays.medium;

public class SetMatrix73 {
    public void setZeroes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
                if(!visited[i][j] && matrix[i][j]==0) {
                    int row = i;
                    int col = j;

                    while(row>0) {
                        row--;
                        if(matrix[row][col]!=0) {
                            matrix[row][col] = 0;
                            visited[row][col] = true;
                        }
                    }
                    row = i;
                    while(col>0) {
                        col--;
                        if(matrix[row][col]!=0) {
                            matrix[row][col] = 0;
                            visited[row][col] = true;
                        }
                    }
                    col = j;
                    while(row<matrix.length-1) {
                        row++;
                        if(matrix[row][col]!=0) {
                            matrix[row][col] = 0;
                            visited[row][col] = true;
                        }
                    }
                    row = i;
                    while(col<matrix[i].length-1) {
                        col++;
                        if(matrix[row][col]!=0) {
                            matrix[row][col] = 0;
                            visited[row][col] = true;
                        }
                    }
                }
                visited[i][j] = true;
            }
        }
    }
}
