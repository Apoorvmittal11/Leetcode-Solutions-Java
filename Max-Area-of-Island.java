class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int totalIsland = 0;

        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if ((visited[i][j] == false) && grid[i][j] == 1) {
                    totalIsland = Math.max(totalIsland, dfs(grid, i, j, visited));
                }
            }
        }
       return totalIsland; 
    }

    private int dfs(int[][] grid, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == 0){
            return 0;
        }

        visited[i][j] = true;
        int counter = 1;
        counter += dfs(grid, i + 1, j, visited); 
        counter += dfs(grid, i - 1, j, visited); 
        counter += dfs(grid, i , j + 1, visited); 
        counter += dfs(grid, i , j - 1, visited); 

        return counter;
    }
}