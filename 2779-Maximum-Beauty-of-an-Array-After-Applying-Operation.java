class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int maxbeauty = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[left] > 2 * k) {
                left++;
            }
            maxbeauty = Math.max(maxbeauty, i - left + 1);
        }
        return maxbeauty;
    }
}