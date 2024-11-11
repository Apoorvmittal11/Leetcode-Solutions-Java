class Solution {
    public boolean primeSubOperation(int[] nums) {
        int diff = 0;
        for (int val : nums) {
            if (val <= diff) {
                return false;
            }
            int prime = val - diff - 1;
            while (prime > 0 && !isPrime(prime)) {
                prime--;
            }
            if (prime > 0) {
                diff = val - prime;
            } else {
                diff = val;
            }
        }
        return true;
    }

    boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}