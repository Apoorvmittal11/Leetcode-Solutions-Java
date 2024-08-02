class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int ones = 0;
        for (int num : nums) {
            if (num == 1) {
                ones++;
            }
        }
        if (ones == 0) {
            return 0;
        }
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
            arr[n + i] = nums[i];
        }
        int i = 0;
        int ans = Integer.MAX_VALUE;
        int zero = 0;
        int j = 0;
        while (j < 2 * n) {
            if (arr[j] == 0) {
                zero++;
            }
            if (j - i == ones - 1) {
                ans = Math.min(ans, zero);
                if (arr[i] == 0) {
                    zero--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}