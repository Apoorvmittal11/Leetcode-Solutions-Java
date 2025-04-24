class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> count = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            count.add(num);
        int distinct = count.size(), res = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == distinct)
                    res++;
            }
            set.clear();
        }
        return res;
    }
}