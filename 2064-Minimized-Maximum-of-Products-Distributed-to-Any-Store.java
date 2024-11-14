class Solution {
    public boolean isPossible(int x, int[] quantities, int n) {
        double sum = 0;
        for (int u : quantities) {
            sum += (u + x - 1) / x;
        }
        return sum <= n;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int left = 1, right = 0;
        for (int quantity : quantities) {
            right = Math.max(right, quantity);
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (isPossible(mid, quantities, n))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
}