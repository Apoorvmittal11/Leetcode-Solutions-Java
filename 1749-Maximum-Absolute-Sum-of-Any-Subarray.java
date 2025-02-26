class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum = 0;
        int negsum = 0;
        int maxsum = 0;
        int minsum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = 0;
            if (negsum > 0)
                negsum = 0;
            sum += nums[i];
            negsum += nums[nums.length - 1 - i];
            minsum = Math.min(negsum, minsum);
            maxsum = Math.max(sum, maxsum);
        }
        maxsum = Math.max(maxsum, Math.abs(minsum));
        return maxsum;
    }
}