class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> store = new ArrayList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                store.add(grid[i][j]);
            }
        }
        Collections.sort(store);
        int ans = 0;
        int mid = store.get((store.size() - 1) / 2);
        for (int num : store) {
            if (num == mid) {
                continue;
            } else if (Math.abs(num - mid) % x != 0) {
                return -1;
            }
            ans += Math.abs(num - mid) / x;
        }
        return ans;
    }
}