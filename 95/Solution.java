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
    public List<TreeNode> generateTrees(int n) {
        if(n==0) return new ArrayList<TreeNode>();
        return helper(1, n);
    }
    List<TreeNode> helper(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        if(start>end) {res.add(null);return res;}
        for(int i=start;i<=end;i++){
            List<TreeNode> left = helper(start, i-1);
            List<TreeNode> right = helper(i+1, end);
            for(TreeNode l:left)
                for(TreeNode r: right){                    
                    TreeNode current = new TreeNode(i);
                    current.left = l;
                    current.right = r;
                    res.add(current);
                }
        }
        return res;
    }
}