class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arr1[] = new int[arr.length];
        HashMap<Integer, Integer> a = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        Arrays.sort(arr1);
        int c = 1;
        for (int i = 0; i < arr.length; i++) {
            if (!a.containsKey(arr1[i])) {
                a.put(arr1[i], c++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a.get(arr[i]);
        }
        return arr;
    }
}