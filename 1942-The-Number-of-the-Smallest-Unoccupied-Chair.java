class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
         int n = times.length;
        List<int[]> events = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            events.add(new int[] {times[i][0], i, 1});
            events.add(new int[] {times[i][1], i, 0});
        }
        events.sort((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[2] - b[2]);

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            availableChairs.add(i);
        }
        int[] chairOfFriend = new int[n];
        for (int[] event : events) {
            int time = event[0];
            int friend = event[1];
            int type = event[2];
            if (type == 1) {
                int assignedChair = availableChairs.poll();
                chairOfFriend[friend] = assignedChair;
                if (friend == targetFriend) {
                    return assignedChair;
                }
            } else {
                availableChairs.offer(chairOfFriend[friend]);
            }
        }
        return -1;
    }
}