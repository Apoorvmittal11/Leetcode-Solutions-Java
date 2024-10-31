class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        int n = robot.size();
        int m = factory.length;
        Collections.sort(robot);
        Arrays.sort(factory, Comparator.comparingInt(a -> a[0]));
        long[][] dp = new long[n + 1][m + 1];
        for (long[] row : dp) {
            Arrays.fill(row, Long.MAX_VALUE / 2);
        }
        dp[0][0] = 0;
        for (int j = 1; j <= m; j++) {
            for (int i = 0; i <= n; i++) {
                dp[i][j] = dp[i][j - 1]; 
                long cost = 0;
                for (int k = 1; k <= factory[j - 1][1] && i - k >= 0; k++) {
                    cost += Math.abs(factory[j - 1][0] - robot.get(i - k));
                    dp[i][j] = Math.min(dp[i][j], dp[i - k][j - 1] + cost);
                }
            }
        }
        return dp[n][m];
    }
}