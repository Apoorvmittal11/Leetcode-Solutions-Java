class Solution {
    public int numSub(String s) {
        int MOD = 1_000_000_007;
        long count = 0, result = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                count++;  
                result = (result + count) % MOD; 
            } else {
                count = 0; 
            }
        }
        
        return (int) result;
    }
}