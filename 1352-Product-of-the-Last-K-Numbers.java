class ProductOfNumbers {
    ArrayList<Integer> ans;
    int mul;

    public ProductOfNumbers() {
        ans = new ArrayList<>();
        mul = 1;
    }

    public void add(int num) {
        ans.add(num);
        mul *= num;
    }

    public int getProduct(int k) {
        int copy = 1;
        for (int i = ans.size() - 1; i >= ans.size() - k; i--) {
            copy *= ans.get(i);
        }
        return copy;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */