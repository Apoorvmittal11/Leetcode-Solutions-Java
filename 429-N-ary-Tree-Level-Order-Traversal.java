/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                res.add(node.val);
                if (node.children != null && !node.children.isEmpty()) {
                    for (Node child : node.children) {
                        q.add(child);
                    }
                }
            }

            ans.add(res);
        }
        return ans;
    }
}