class Solution {
    public int partitionString(String s) {
        Set<Character> ans = new HashSet<>();
        int i = 0;
        int count = 0;
        while (i < s.length()) {
            count++;
            while (i < s.length() && !ans.contains(s.charAt(i))) {
                ans.add(s.charAt(i));
                i++;
            }
            ans.clear();
        }
        return count;
    }
}