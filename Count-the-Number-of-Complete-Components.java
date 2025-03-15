class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        int adjMat[][] = new int[n][n];
        for (int i = 0; i < edges.length; i++) {
            adjMat[edges[i][0]][edges[i][1]] = 1;
            adjMat[edges[i][1]][edges[i][0]] = 1;
        }
        boolean visited[] = new boolean[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                dfs(adjMat, i, visited, component);
                if (isComplete(component, adjMat)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public void dfs(int adjMat[][], int sv, boolean visited[], List<Integer> component) {
        visited[sv] = true;
        component.add(sv);
        for (int i = 0; i < adjMat.length; i++) {
            if (adjMat[sv][i] == 1 && !visited[i]) {
                dfs(adjMat, i, visited, component);
            }
        }
    }

    public boolean isComplete(List<Integer> component, int[][] adjMat) {
        int size = component.size();
        for (int node : component) {
            int connections = 0;
            for (int neighbor : component) {
                if (node != neighbor && adjMat[node][neighbor] == 1) {
                    connections++;
                }
            }
            if (connections != size - 1) {
                return false;
            }
        }
        return true;
    }
}
