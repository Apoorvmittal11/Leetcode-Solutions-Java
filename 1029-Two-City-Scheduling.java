class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int cost = 0;
        int n = costs.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            cost += costs[i][0];
            ans[i] = costs[i][1] - costs[i][0];
        }
        Arrays.sort(ans);
        for (int i = 0; i < n / 2; i++) {
            cost += ans[i];
        }
        return cost;
    }
}