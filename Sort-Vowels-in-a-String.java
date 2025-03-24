class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        LinkedList<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                list.add(ch);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                char firstElement = list.pollFirst();
                sb.append(firstElement);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}