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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();
        dfs(root1, leaf1);
        dfs(root2, leaf2);
        if(leaf1.size()!=leaf2.size()) return false;
        int len = leaf1.size();
        for(int i=0;i<len;i++)
            if(leaf1.get(i)!=leaf2.get(i)) return false;
        return true;
    }
    private void dfs(TreeNode root, ArrayList<Integer> res){
        if(root == null) return ;
        if(root.left == null && root.right == null) res.add(root.val);
        dfs(root.left, res);
        dfs(root.right, res);
    }
}