class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;
        for (int c : candies) {
            total += c;
        }
        int right = (int) (total / k);
        if (right == 0) {
            return 0;
        }
        int left = 1, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long count = 0;
            for (int i : candies) {
                count += i / mid;
            }
            if (count >= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return ans;
    }
}