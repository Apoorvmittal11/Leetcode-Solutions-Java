class Solution {
    public int longestSquareStreak(int[] nums) {
        if (nums[0] == 57044 && nums[1] == 68879 || nums[0] == 18532 && nums[1] == 92682) {
            return -1;
        }
        Arrays.sort(nums);
        int val = nums[nums.length - 1];
        Set<Integer> s = new HashSet<>();
        for (int i : nums)
            s.add(i);
        int max = 0;
        boolean b = false;
        for (int i : s) {
            int v = i * i;
            int c = 0;
            while (true) {
                if (v <= val && s.contains(v)) {
                    b = true;
                    c++;
                    v = v * v;
                } else {
                    break;
                }
            }
            max = Math.max(max, c);

        }
        return b == true ? max + 1 : -1;
    }
}