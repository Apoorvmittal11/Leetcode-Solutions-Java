class Solution {
    int n;
    public int regionsBySlashes(String[] grid) {
        n = grid[0].length() * 3;
        int grid_new[][] = new int[n][n];
        int r = 0;
        int c = 0;

        for (int i = 0; i < grid.length; i++) {
            String current = grid[i];
            for (int j = 0; j < grid.length; j++) {

                if (current.charAt(j) == '/') {

                    grid_new[r][c + 2] = 1;
                    grid_new[r + 1][c + 1] = 1;
                    grid_new[r + 2][c] = 1;

                } else if (current.charAt(j) == '\\') {

                    grid_new[r + 2][c + 2] = 1;
                    grid_new[r + 1][c + 1] = 1;
                    grid_new[r][c] = 1;

                }

                c += 3;

                if (c >= n) {
                    c = 0;
                }

            }

            r += 3;
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid_new[i][j] == 0) {
                    dfs(grid_new, i, j);
                    count++;
                }
            }
        }
        return count;

    }

    void dfs(int grid[][], int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= n || grid[i][j] == 1) {
            return;
        }

        grid[i][j] = 1;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }
}