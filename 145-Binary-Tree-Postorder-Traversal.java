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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        postorder(result, root);
        return result;
    }

    private void postorder(List<Integer> arr, TreeNode node) {
        if (node == null)
            return;

        postorder(arr, node.left);
        postorder(arr, node.right);
        arr.add(node.val);
    }
}