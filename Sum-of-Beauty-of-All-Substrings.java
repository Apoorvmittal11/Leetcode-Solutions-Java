class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int totalBeauty = 0;
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;
                totalBeauty += getBeauty(freq);
            }
        }
        return totalBeauty;
    }

    public int getBeauty(int[] freq) {
        int maxFreq = 0, minFreq = Integer.MAX_VALUE;
        for (int num : freq) {
            if (num > 0) {
                maxFreq = Math.max(maxFreq, num);
                minFreq = Math.min(minFreq, num);
            }
        }
        return maxFreq - minFreq;
    }
}