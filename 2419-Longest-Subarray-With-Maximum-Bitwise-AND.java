class Solution {
    public static int helper(int arr[]) {
        int n = arr.length;
        int ans = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < n; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        int i = 0, j = 0;
        while (j < n) {
            if (arr[j] == max) {
                count = j - i + 1;
            } else {
                i = j + 1;
                count = 1;
            }
            j++;
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public int longestSubarray(int[] nums) {
        return helper(nums);
    }
}