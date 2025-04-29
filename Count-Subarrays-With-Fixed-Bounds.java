class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int maxpos = -1, minpos = -1, leftbound = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK) {
                leftbound = i;
            }
            if (nums[i] == minK) {
                minpos = i;
            }
            if (nums[i] == maxK) {
                maxpos = i;
            }
            count += Math.max(0, Math.min(minpos, maxpos) - leftbound);
        }
        return count;
    }
}