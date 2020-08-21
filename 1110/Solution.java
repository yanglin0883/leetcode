/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        TreeNode parent = new TreeNode(0);
        parent.left = root;
        boolean isLeft = true;
        Set<Integer> del = new HashSet<>();
        for(int i:to_delete)
            del.add(i);
        helper(root, parent, isLeft, false, del);
        if(parent.left!=null) res.add(parent.left);
        return res;
    }
    ArrayList<TreeNode> res = new ArrayList<>();
    void helper(TreeNode root, 
                TreeNode parent, 
                boolean isLeft, 
                boolean isNewRoot,  
                Set<Integer>del){
        if(root==null) return;
        if(del.contains(root.val)){
            if(isLeft) parent.left = null;
            else parent.right = null;
            isNewRoot = true;
        }
        else if(isNewRoot){
            res.add(root);
            isNewRoot = false;
        }
        helper(root.left, root, true, isNewRoot, del);        
        helper(root.right, root, false, isNewRoot, del);
    }
}