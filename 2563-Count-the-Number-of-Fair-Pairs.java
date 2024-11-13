class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    public long count(int[] nums, int limit) {
        int i = 0, j = nums.length - 1;
        long count = 0;
        while (i < j) {
            while (i < j && nums[i] + nums[j] > limit) {
                j--;
            }
            count += (j - i);
            i++;
        }
        return count;
    }
}