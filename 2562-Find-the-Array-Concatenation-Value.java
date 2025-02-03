class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        for (int i = 0; i < (nums.length / 2); i++) {
            String tmp = nums[i] + "" + nums[nums.length - 1 - i];
            res = res + Integer.parseInt(tmp);
        }
        if (nums.length % 2 == 1) {
            res = res + nums[(nums.length / 2)];
        }
        return res;
    }
}