class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        String[] strArr1 = Arrays.stream(arr1).mapToObj(String::valueOf).toArray(String[]::new);
        String[] strArr2 = Arrays.stream(arr2).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        int maxLength = 0;
        int i = 0, j = 0;
        while (i < strArr1.length && j < strArr2.length) {
            String str1 = strArr1[i];
            String str2 = strArr2[j];
            int commonPrefixLength = getCommonPrefixLength(str1, str2);
            maxLength = Math.max(maxLength, commonPrefixLength);
            if (str1.compareTo(str2) < 0) {
                i++;
            } else {
                j++;
            }
        }
        return maxLength;
    }

    private int getCommonPrefixLength(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        int i = 0;
        while (i < minLength && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }
}