class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int len = part.length();
        while (true) {
            int ind = sb.indexOf(part);
            if (ind == -1) {
                break;
            }
            sb.delete(ind, ind + len);
        }
        return sb.toString();
    }
}