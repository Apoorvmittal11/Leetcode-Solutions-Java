class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans = 0;
        String[] words = text.split(" ");
        char alp[] = brokenLetters.toCharArray();
        for (String word : words) {
            boolean canType = true;
            for (char ch : alp) {
                if (word.indexOf(ch) != -1) {
                    canType = false;
                    break;
                }
            }
            if(canType)ans++;
        }
        return ans;
    }
}