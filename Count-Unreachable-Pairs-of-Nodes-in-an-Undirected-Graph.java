import java.util.*;

class Solution {
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]); 
        }

        boolean[] visited = new boolean[n];
        List<Integer> componentSizes = new ArrayList<>();
        long totalNodes = n, totalPairs = (totalNodes * (totalNodes - 1)) / 2; // 
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int componentSize = dfs(adjList, i, visited);
                componentSizes.add(componentSize);
            }
        }
        long reachablePairs = 0;
        for (int size : componentSizes) {
            reachablePairs += (long) size * (size - 1) / 2; 
        }

        return totalPairs - reachablePairs; 
    }

    private int dfs(List<List<Integer>> adjList, int node, boolean[] visited) {
        visited[node] = true;
        int count = 1;
        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(adjList, neighbor, visited);
            }
        }
        return count;
    }
}
