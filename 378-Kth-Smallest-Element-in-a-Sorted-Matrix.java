class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int[] temp = new int[n * n];
        int point = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j : matrix[i]) {
                temp[point++] = j;
            }
        }
        Arrays.sort(temp);

        return temp[k - 1];
    }
}