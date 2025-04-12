class Solution {
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int battleShips = 0;
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[i][j] == 'X' && (!visited[i][j])){  
                    dfs(board, i, j, visited);
                    battleShips += 1;   
                }
            }
        }
        return battleShips;
    }
    private void dfs(char[][] board, int i, int j, boolean[][] visited){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'X' || visited[i][j]){
            return;
        }

        visited[i][j] = true;  

        dfs(board, i + 1, j, visited);  
        dfs(board, i - 1, j, visited);  
        dfs(board, i, j + 1, visited);  
        dfs(board, i, j - 1, visited);  

    }
}