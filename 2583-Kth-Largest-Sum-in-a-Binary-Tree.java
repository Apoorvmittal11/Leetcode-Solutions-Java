class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        while (!queue.isEmpty()) {
            int size = queue.size();
            long levelSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                levelSum += node.val;

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            maxHeap.add(levelSum);
        }
        if (maxHeap.size() < k)
            return -1;
        for (int i = 0; i < k - 1; i++) {
            maxHeap.remove();
        }
        return maxHeap.peek();
    }
}