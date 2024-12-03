class Solution {
    public String addSpaces(String s, int[] spaces) {
        int m = s.length(), n = spaces.length;
        StringBuilder ans = new StringBuilder(); 
        for (int i = 0, j = 0; i < m; i++) {
            if (j < n && spaces[j] == i) { 
                j++;
                ans.append(' ');
            }
            ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}