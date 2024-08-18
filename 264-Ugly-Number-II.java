class Solution {
    public int nthUglyNumber(int n) {
        int un1 = 1;
        int un2 = 1;
        int un3 = 1;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            int a = arr[un1] * 2;
            int b = arr[un2] * 3;
            int c = arr[un3] * 5;

            int findNextUgly = Math.min(Math.min(a, b), c);
            arr[i] = findNextUgly;

            if (findNextUgly == a) {
                un1++;
            }
            if (findNextUgly == b) {
                un2++;
            }
            if (findNextUgly == c) {
                un3++;
            }
        }

        return arr[n];
    }
}