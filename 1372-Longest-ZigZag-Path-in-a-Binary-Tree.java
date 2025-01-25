class Solution {
    private int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }

    public boolean isGoodArray(int[] nums) {
        int res = nums[0];
        for (int num : nums) {
            res = gcd(res, num);
        }
        return res == 1;
    }
}