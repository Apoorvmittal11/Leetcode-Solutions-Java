class Solution {
    public List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean isLonely = true;
            if (i > 0 && (nums[i] == nums[i - 1] || nums[i] == nums[i - 1] + 1)) {
                isLonely = false;
            }
            if (i < nums.length - 1 && (nums[i] == nums[i + 1] || nums[i] == nums[i + 1] - 1)) {
                isLonely = false;
            }
            if (isLonely) {
                list.add(nums[i]);
            }
        }
        return list;
    }
}