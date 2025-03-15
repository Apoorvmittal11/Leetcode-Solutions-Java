class Solution {
    public int makeConnected(int n, int[][] edges) {
        if (edges.length < n - 1)
            return -1;
        List<List<Integer>> adjMat = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjMat.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adjMat.get(edges[i][0]).add(edges[i][1]);
            adjMat.get(edges[i][1]).add(edges[i][0]);
        }
        boolean visited[] = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ans++;
                dfs(adjMat, i, visited);
            }
        }
        return ans - 1;
    }

    public void dfs(List<List<Integer>> adjMat, int sv, boolean visited[]) {
        visited[sv] = true;
        for (int neighbor : adjMat.get(sv)) {
            if (!visited[neighbor]) {
                dfs(adjMat, neighbor, visited);
            }
        }
    }
}