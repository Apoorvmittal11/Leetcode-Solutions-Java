/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.val % 2 == 0) {
                    if (node.left != null && node.left.left != null) {
                        ans += node.left.left.val;
                    }
                    if (node.left != null && node.left.right != null) {
                        ans += node.left.right.val;
                    }
                    if (node.right != null && node.right.left != null) {
                        ans += node.right.left.val;
                    }
                    if (node.right != null && node.right.right != null) {
                        ans += node.right.right.val;
                    }
                }
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }
        return ans;
    }
}