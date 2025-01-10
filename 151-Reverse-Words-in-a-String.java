class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(\ \);
        int i = 0;
        int j = words.length - 1;

        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(\ \);
                }
                sb.append(word);
            }
        }

        return sb.toString();
    }
}