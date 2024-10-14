class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }
        long ans = 0;
        while (k > 0) {
            int curr = pq.remove();
            ans += curr;
            int temp = (int) Math.ceil(curr * 1.0 / 3);
            pq.add(temp);
            k--;
        }
        return ans;
    }
}