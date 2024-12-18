class Solution {
    public int[] finalPrices(int[] arr) {
        int[] disc = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] <= arr[i]) {
                    disc[i] = arr[i] - arr[j];
                    break;
                }
            }
            if (j == arr.length) {
                disc[i] = arr[i];
            }

        }
        return disc;
    }
}