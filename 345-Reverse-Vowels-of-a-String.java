class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vowels = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                vowels.push(c);
        }
        for (char c : s.toCharArray()) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
                sb.append(vowels.pop());
            else
                sb.append(c);
        }
        return sb.toString();
    }
}