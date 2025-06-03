class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) { 
                for (int j = 0; j < cols; j++) {
                    grid[i][j] ^= 1; 
                }
            }
        }
        for (int j = 1; j < cols; j++) { 
            int noz = 0; 
            for (int i = 0; i < rows; i++) {
                if (grid[i][j] == 0) noz++;
            }
            if (noz > rows / 2) { 
                for (int i = 0; i < rows; i++) {
                    grid[i][j] ^= 1;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            int x = 1;
            for (int j = cols - 1; j >= 0; j--) {
                sum += grid[i][j] * x;
                x *= 2;
            }
        }
        return sum;
    }
}