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
    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        postorder(result, root);
        return result;
    }

    private void postorder(List<Integer> arr, Node node) {
        if (node == null) {
            return;
        }

        for (Node child : node.children) {
            postorder(arr, child);
        }
        arr.add(node.val);
    }
}