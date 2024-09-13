class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int max = capacity;
        int ans = 0;
        for (int i = 0; i < plants.length; i++) {
            if (max - plants[i] < 0) {
                max = capacity;
                ans += i + 1;
                ans += i;
                max -= plants[i];

            } else {
                ans++;
                max -= plants[i];
            }
        }
        return ans;
    }
}