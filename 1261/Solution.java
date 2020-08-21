/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class FindElements {
    TreeNode root;
    Set<Integer> set = new HashSet();
    public FindElements(TreeNode root) {
        this.root = root;
        if(root!=null)root.val =0 ;
        dfs(root);
    }
    void dfs(TreeNode root){
        if(root==null) return;
        set.add(root.val);
        // System.out.println(set);
        if(root.left!=null) {root.left.val = 2*root.val+1; dfs(root.left);}
        if(root.right!=null) {root.right.val = 2*root.val+2; dfs(root.right);}
    }
    
    public boolean find(int target) {
        return set.contains(target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */