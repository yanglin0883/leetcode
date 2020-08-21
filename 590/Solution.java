/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        dfs(root);
        return res;
    }
    List<Integer> res = new ArrayList<Integer>();
    private void dfs(Node root){
        if(root==null) return;
        for(Node node: root.children){
            dfs(node);
        }
        res.add(root.val);
    }
}