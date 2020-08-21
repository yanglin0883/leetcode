/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {

    public BSTIterator(TreeNode root) {
        ArrayList<Integer> temp = new ArrayList();
        dfs(root, temp);
        it = temp.iterator();
    }
    void dfs(TreeNode root, ArrayList<Integer> res){
        if(root==null) return;
        dfs(root.left, res);
        res.add(root.val);
        dfs(root.right, res);
    }
    Iterator<Integer> it;
    /** @return the next smallest number */
    public int next() {
        return it.next();
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return it.hasNext();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */