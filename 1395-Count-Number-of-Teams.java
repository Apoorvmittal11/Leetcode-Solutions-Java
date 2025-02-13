class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i; j < n - 1; j++) {
                for (int k = j; k < n; k++) {
                    if ((rating[i] < rating[j] && rating[j] < rating[k]) ||
                            (rating[i] > rating[j] && rating[j] > rating[k])) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }
}