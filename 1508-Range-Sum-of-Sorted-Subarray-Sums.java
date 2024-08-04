class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int m = 1000000007;
        int k = 0;
        int arr[] = new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s += nums[j];
                arr[k++] = s;
            }
        }
        long sum = 0;
        Arrays.sort(arr);
        for (int i = left - 1; i < right; i++) {
            sum += arr[i];
            sum %= m;
        }
        return (int)sum;
    }
}