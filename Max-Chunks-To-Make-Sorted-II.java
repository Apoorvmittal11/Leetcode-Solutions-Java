class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] rightMin = new int[n + 1];
        rightMin[n] = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i]);
        }

        int chunks = 0;
        int leftMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(leftMax, arr[i]);
            if (leftMax <= rightMin[i + 1]) {
                chunks++;
            }
        }

        return chunks;
    }
}