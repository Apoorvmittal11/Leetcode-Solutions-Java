class Solution {
    public int strangePrinter(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][n + 1];

        for (int l = n - 1; l >= 0; l--) {
            for (int r = l; r < n; r++) {
                int res = 1 + dp[l + 1][r];
                for (int i = l + 1; i <= r; i++) {
                    if (s.charAt(l) == s.charAt(i)) {
                        res = Math.min(res, dp[l][i - 1] + dp[i + 1][r]);
                    }
                }
                dp[l][r] = res;
            }
        }

        return dp[0][n - 1];
    }
}