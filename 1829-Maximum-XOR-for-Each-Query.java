class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int c = 0;
        for (int num : nums) {
            c ^= num;
        }
        int max = (1 << maximumBit) - 1;
        for (int i = 0; i <= n - 1; i++) {
            ans[i] = c ^ max;
            c ^= nums[n - i - 1];
        }
        return ans;
    }
}