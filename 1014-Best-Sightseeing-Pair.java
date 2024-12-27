class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int n = values.length;
        int max = values[0];
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, (values[i] - i + max));
            max = Math.max(max, values[i] + i);
        }
        return res;
    }
}