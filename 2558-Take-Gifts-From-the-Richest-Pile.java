class Solution {
    public long pickGifts(int[] gifts, int k) {
        Arrays.sort(gifts);
        int n = gifts.length;
        for (int i = 0; i < k; i++) {
            gifts[n - 1] = (int) Math.sqrt(gifts[n - 1]);
            Arrays.sort(gifts);
        }
        long ans = 0;
        for (int gift : gifts) {
            ans += gift;
        }
        return ans;
    }
}