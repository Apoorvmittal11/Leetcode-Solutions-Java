class Solution {
    static int res;
    public int findTargetSumWays(int[] nums, int target) {
        res = 0;
        solve(nums, target, 0, 0); 
        return res; 
    }

    public static void solve(int[] nums, int target, int sum, int i) {
        if (i >= nums.length) { 
            if (i == nums.length && target == sum) { 
                res++; 
            }
            return; 
        }
        solve(nums, target, sum + nums[i], i + 1); 
        solve(nums, target, sum - nums[i], i + 1); 
    }
}