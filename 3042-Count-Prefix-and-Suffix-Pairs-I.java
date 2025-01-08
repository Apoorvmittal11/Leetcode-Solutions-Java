class Solution {
    public boolean solve(String str1, String str2) {
        int n = str1.length();
        if (str2.length() < str1.length())
            return false;
        String prefix = str2.substring(0, n);
        int last = str2.length() - n;
        String suffix = str2.substring(last, str2.length());
        if (str1.equals(prefix) && str1.equals(suffix)) {
            return true;
        }
        return false;

    }

    public int countPrefixSuffixPairs(String[] words) {
        int ans = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (solve(words[i], words[j])) {
                    ans++;
                }
            }
        }
        return ans;

    }
}