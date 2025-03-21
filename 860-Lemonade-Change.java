class MyCircularQueue {
    int front, rear;
    int items[];

    public MyCircularQueue(int k) {
        items = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % items.length;
            items[rear] = value;
            return true;
        }
    }

    public boolean deQueue() {
        int element;
        if (isEmpty()) {
            return false;
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % items.length;
            }
            return true;
        }
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return items[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return items[rear];
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (front == 0 && rear == items.length - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */