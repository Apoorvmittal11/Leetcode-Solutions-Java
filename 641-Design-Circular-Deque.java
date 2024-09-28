class MyCircularDeque {
    int[] arr;
    int start;
    int end;
    int len;
    int k;

    public MyCircularDeque(int k) {
        arr = new int[k];
        start = -1;
        end = -1;
        len = 0;
        this.k = k;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        if (start == -1) {
            start = 0;
        } else {
            start = (start - 1 + k) % k;
        }
        arr[start] = value;
        if (end == -1) {
            end = start;
        }
        len++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        end = (end + 1) % k;
        arr[end] = value;
        if (start == -1) {
            start = end;
        }
        len++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        start = (start + 1) % k;
        len--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        end = (end - 1 + k) % k;
        len--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[start];
    }

    public int getRear() {
        return isEmpty() ? -1 : arr[end];
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return len == k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */