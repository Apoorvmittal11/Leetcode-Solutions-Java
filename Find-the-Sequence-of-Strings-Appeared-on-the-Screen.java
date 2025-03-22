class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] elementFrequency = new int[101];
        for (int num : nums) {
            elementFrequency[num]++;
            if (elementFrequency[num] > 2) {
                return false;
            }
        }
        return true;
    }
}