class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1];
        dp[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            int day1 = i, day7 = i, day30 = i;
            while (day1 < n && days[day1] < days[i] + 1) day1++;
            while (day7 < n && days[day7] < days[i] + 7) day7++;
            while (day30 < n && days[day30] < days[i] + 30) day30++;

            dp[i] = Math.min(costs[0] + dp[day1], 
                             Math.min(costs[1] + dp[day7], 
                                      costs[2] + dp[day30]));
        }

        return dp[0];
    }
}