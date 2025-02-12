class NeighborSum {
    private int[] suma = new int[101];  
    private int[] sumd = new int[101];  
    private final int[] adj = {0, 1, 0, -1, 0};  
    private final int[] dia = {1, 1, -1, -1, 1}; 

    public NeighborSum(int[][] grid) {
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                for (int d = 0; d < 4; ++d) {
                    add(i + adj[d], j + adj[d + 1], grid[i][j], suma, grid);
                    add(i + dia[d], j + dia[d + 1], grid[i][j], sumd, grid);
                }
            }
        }
    }

    private void add(int i, int j, int val, int[] arr, int[][] grid) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length) {
            arr[grid[i][j]] += val;
        }
    }

    public int adjacentSum(int value) {
        return suma[value];
    }

    public int diagonalSum(int value) {
        return sumd[value];
    }
}