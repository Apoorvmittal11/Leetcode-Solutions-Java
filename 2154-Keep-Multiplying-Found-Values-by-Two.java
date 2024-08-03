class Solution {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
        }
        while (ans.contains(original)) {
            original *= 2;
        }
        return original;
    }
}