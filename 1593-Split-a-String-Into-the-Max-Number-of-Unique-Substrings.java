class Solution {
    private int res = 1;
    public int maxUniqueSplit(String s) {
        HashSet<String> mp = new HashSet<>();

        check(0, s, mp);
        return res;
    }

    public void check(int i, String s, HashSet<String> mp) {
        if (i == s.length()) {
            res = Math.max(mp.size(), res);
        }
        for (int j = i + 1; j <= s.length(); j++) {
            String str = s.substring(i, j);
            if (!mp.contains(str)) {
                mp.add(str);
                check(j, s, mp);
                mp.remove(str);
            }
        }

    }
}