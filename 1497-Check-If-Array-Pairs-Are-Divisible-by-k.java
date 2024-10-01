class CustomStack {
    int arr[], top = -1, maxSize;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    public void push(int x) {
        if (top < maxSize - 1)
            arr[++top] = x;
    }

    public int pop() {
        if (top != -1) {
            int val = arr[top--];
            return val;
        }
        return -1;
    }

    public void increment(int k, int val) {
        if (top != -1) {
            if (k <= top) {
                for (int i = 0; i < k; ++i)
                    arr[i] += val;
            } else {
                for (int i = 0; i <= top; ++i)
                    arr[i] += val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */