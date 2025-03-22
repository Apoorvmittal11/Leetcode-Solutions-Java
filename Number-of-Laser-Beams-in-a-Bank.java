class Solution {
    private int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }

    public boolean gcdSort(int[] nums) {
        int arr[]=new int[nums.length];
        int i;
        for (i=0;i<nums.length-1;i++) {
            int res = gcd(nums[i], nums[i+1]);
            arr[i]=res;
        }
        arr[i]=nums[nums.length-1];
        Arrays.sort(arr);
        Arrays.sort(nums);
        return arr==nums;
    }
}