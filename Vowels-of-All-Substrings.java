class Solution {
    public long countVowels(String s) {
        long co = 0, sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                co = co + i + 1;
            }
            sum += co;
        }
        return sum;
    }
}