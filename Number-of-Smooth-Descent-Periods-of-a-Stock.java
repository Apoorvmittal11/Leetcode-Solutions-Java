class Solution {
    public long getDescentPeriods(int[] prices) {
        long total = 1;  
        int count = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                count++;
            } else {
                count = 1;
            }
            total += count;
        }

        return total;
    }
}