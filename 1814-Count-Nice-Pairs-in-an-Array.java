class Solution {
    public static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = (r * 10) + (n % 10);
            n /= 10;
        }
        return r;
    }

    public int countNicePairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int pairs = 0;
        for (int v : nums) {
            int revDiff = v - reverse(v);
            int d = map.getOrDefault(revDiff, 0);
            pairs = (pairs + d) % 1000000007;
            map.put(revDiff, d + 1);
        }
        return pairs;
    }
}