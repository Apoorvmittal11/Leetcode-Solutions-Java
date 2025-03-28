class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0, j = 0;
        List<int[]> resultList = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i][0] < nums2[j][0]) {
                resultList.add(nums1[i]);
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                resultList.add(nums2[j]);
                j++;
            } else {
                resultList.add(new int[] { nums1[i][0], nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            resultList.add(nums1[i]);
            i++;
        }
        while (j < nums2.length) {
            resultList.add(nums2[j]);
            j++;
        }
        int[][] resultArray = new int[resultList.size()][2];
        for (int k = 0; k < resultList.size(); k++) {
            resultArray[k] = resultList.get(k);
        }
        return resultArray;
    }
}