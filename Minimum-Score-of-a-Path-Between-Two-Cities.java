class Solution {
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) graph[i] = new ArrayList<>();
        for (int[] road : roads) {
            int u = road[0], v = road[1], dist = road[2];
            graph[u].add(new int[]{v, dist});
            graph[v].add(new int[]{u, dist});
        }

        boolean[] visited = new boolean[n + 1];
        int[] min = new int[]{Integer.MAX_VALUE};

        dfs(1, graph, visited, min);
        return min[0];
    }

    private void dfs(int node, List<int[]>[] graph, boolean[] visited, int[] min) {
        visited[node] = true;
        for (int[] neighbor : graph[node]) {
            min[0] = Math.min(min[0], neighbor[1]);
            if (!visited[neighbor[0]]) {
                dfs(neighbor[0], graph, visited, min);
            }
        }
    }
}
