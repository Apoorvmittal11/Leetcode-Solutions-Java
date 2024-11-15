class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        while (left + 1 < n && arr[left] <= arr[left + 1]) {
            left++;
        }
        if (left == n - 1) {
            return 0;
        }
        int right = n - 1;
        while (right - 1 >= 0 && arr[right - 1] <= arr[right]) {
            right--;
        }
        int ans = Math.min(n - left - 1, right); 
        for (int i = 0; i <= left; i++) {
            while (right < n && arr[i] > arr[right]) {
                right++;
            }
            ans = Math.min(ans, right - i - 1);
        }
        return ans;
    }
}