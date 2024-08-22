class Solution {
    public int findComplement(int num) {
        int i = 1;
        int n = num;
        while (i < n) {
            i = (i << 1) | 1;
        }
        return num ^ i;
    }
}