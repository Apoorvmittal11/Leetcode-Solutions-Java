class Solution {
    int max = 0;
    int start;
    boolean infect = false;
    public int amountOfTime(TreeNode root, int start) {
        this.start = start;
        helper(root);
        return max;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        if(root.val == start){
            infect = true;
            max = findmax(root) - 1;
            return 1;
        }
        int right  = helper(root.right);
        if(infect){
            max = Math.max(max, findmax(root.left)+right);
            return right+1;
        }
        int left = helper(root.left);
        if(infect){
            max = Math.max(max, right+left);
            return left+1;
        }
        return Math.max(right,left)+1;
    }
    public int findmax(TreeNode root){
        if(root == null) return 0;
        return Math.max(findmax(root.right), findmax(root.left)) + 1;
    }
}