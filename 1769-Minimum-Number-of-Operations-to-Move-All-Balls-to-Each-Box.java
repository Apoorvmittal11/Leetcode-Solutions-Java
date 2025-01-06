class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = solve(boxes, i);
        }
        return ans;
    }

    public int solve(String boxes, int k) {
        int count = 0;
        for (int i = 0; i < boxes.length(); i++) {
            if (boxes.charAt(i) == '1') {
                count += Math.abs(k - i);
            }
        }
        return count;
    }
}