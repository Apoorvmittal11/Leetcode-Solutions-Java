class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }
        Set<Integer> restrictedSet = new HashSet<>();
        for (int node : restricted) {
            restrictedSet.add(node);
        }
        boolean[] visited = new boolean[n];
        return dfs(adjList, 0, visited, restrictedSet);
    }

    private int dfs(List<List<Integer>> adjList, int node, boolean[] visited, Set<Integer> restrictedSet) {
        if (restrictedSet.contains(node)) return 0; 
        visited[node] = true;
        int count = 1; 
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(adjList, neighbor, visited, restrictedSet);
            }
        }
        return count;
    }
}
