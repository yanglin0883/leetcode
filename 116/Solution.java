/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        if(root==null) return null;
        helper(root);
        return root;
    }
    
    private void helper(Node root){
        if(root.left!=null){
            root.left.next = root.right;
            helper(root.left);
        }
        if(root.right!=null){
            if(root.next!=null) {
                root.right.next = root.next.left;
            }
            helper(root.right);
        }
    }
}