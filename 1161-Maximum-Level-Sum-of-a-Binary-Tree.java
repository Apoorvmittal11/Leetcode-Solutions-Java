/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Integer res = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                res += node.val;
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }

            ans.add(res);
        }
        int level=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>max){
                max=ans.get(i);
                level=i;
            }
        }
        return level+1;
    }
}