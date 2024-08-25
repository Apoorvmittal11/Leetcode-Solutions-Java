class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int element = matrix[row][col];
                if (element == target) {
                    return true;
                }
            }
        }
        return false;
    }
}