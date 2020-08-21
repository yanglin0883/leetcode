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
        Queue<Node> bfs = new LinkedList<Node>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0;i<size;i++){
                Node node = bfs.poll();
                node.next = bfs.peek();
                if(i==size-1) node.next =null;
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
        }
        return root;
    }
}