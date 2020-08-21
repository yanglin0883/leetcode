/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class CBTInserter {
    ArrayList<TreeNode> tree  = new ArrayList<>();
    public CBTInserter(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            TreeNode node = bfs.poll();
            tree.add(node);
            if(node.left!=null) bfs.offer(node.left);
            if(node.right!=null) bfs.offer(node.right);
        }
    }
    
    public int insert(int v) {
        TreeNode parent = tree.get((tree.size()-1)/2);
        boolean isLeft = tree.size()%2==1;
        TreeNode newNode = new TreeNode(v);
        if(isLeft) parent.left = newNode;
        else parent.right = newNode;
        tree.add(newNode);
        return parent.val;
    }
    
    public TreeNode get_root() {
        return tree.get(0);
    }
}

/**
 * Your CBTInserter object will be instantiated and called as such:
 * CBTInserter obj = new CBTInserter(root);
 * int param_1 = obj.insert(v);
 * TreeNode param_2 = obj.get_root();
 */