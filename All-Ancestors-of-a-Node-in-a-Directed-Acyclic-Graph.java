class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        int adjMat[][] = new int[n][n];
        for (int i = 0; i < edges.length; i++) {
            adjMat[edges[i][1]][edges[i][0]] = 1;
        }
        // boolean visited[]=new boolean[n];
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            boolean visited[] = new boolean[n];
            List<Integer> component = new ArrayList<>();
            dfs(adjMat, i, visited, component);
            component.remove(0);
            Collections.sort(component);
            ans.add(component);
        }
        return ans;
    }

    public void dfs(int[][] adjMat, int sv, boolean[] visited, List<Integer> component) {
        visited[sv] = true;
        component.add(sv);
        for (int i = 0; i < adjMat.length; i++) {
            if (adjMat[sv][i] == 1 && !visited[i]) {
                dfs(adjMat, i, visited, component);
            }
        }
    }
}