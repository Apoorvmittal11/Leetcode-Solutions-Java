class Solution {
    public int minSetSize(int[] arr) {
        int[] count = new int[100001];
        for (int a : arr)
            count[a]++;
        Arrays.sort(count);
        int n = arr.length;
        int sum = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            sum = sum + count[i];
            if (sum >= n / 2)
                return count.length - i;
        }
        return 0;
    }
}