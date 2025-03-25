class Solution {
    public int numOfPairs(String[] nums, String target) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i].concat(nums[j]).equals(target)) {
                    res++;
                }
                if (nums[j].concat(nums[i]).equals(target)) {
                    res++;
                }
            }
        }
        return res;
    }
}