class ExamRoom {
    private int n;
    private ArrayList<Integer> seats;

    public ExamRoom(int n) {
        this.n = n;
        this.seats = new ArrayList<>();
    }

    public int seat() {
        if (seats.size() == 0) {
            seats.add(0);
            return 0;
        }

        int maxDistance = seats.get(0);
        int seatToTake = 0;

        for (int i = 1; i < seats.size(); i++) {
            int prevSeat = seats.get(i - 1);
            int currSeat = seats.get(i);
            int distance = (currSeat - prevSeat) / 2;

            if (distance > maxDistance) {
                maxDistance = distance;
                seatToTake = prevSeat + distance;
            }
        }

        if (n - 1 - seats.get(seats.size() - 1) > maxDistance) {
            seatToTake = n - 1;
        }

        seats.add(seatToTake);
        Collections.sort(seats);

        return seatToTake;
    }

    public void leave(int p) {
        seats.remove(Integer.valueOf(p));
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(n);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */