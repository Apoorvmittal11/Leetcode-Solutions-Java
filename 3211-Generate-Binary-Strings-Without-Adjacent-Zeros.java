class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        generateStrings(n, "", result);
        return result;
    }
    
    private void generateStrings(int n, String current, List<String> result) {
        if (current.length() == n) {
            result.add(current);
            return;
        }
        if (isValid(current + "0")) {
            generateStrings(n, current + "0", result);
        }
        generateStrings(n, current + "1", result);
    }
    
    private boolean isValid(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0' && s.charAt(i + 1) == '0') {
                return false;
            }
        }
        return true;
    }
}