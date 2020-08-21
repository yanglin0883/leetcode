/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        t= sum;
        s.put(0,1);
        dfs(root, 0);
        return res;
    }
    int t, res=0;
    Map<Integer, Integer> s = new HashMap();
    void dfs(TreeNode root, int sum){
        if(root==null) return;
        sum+=root.val;
        if(s.containsKey(sum-t))
            res += s.get(sum-t);
        s.put(sum, s.getOrDefault(sum,0)+1);
        dfs(root.left, sum);
        dfs(root.right, sum);
        s.put(sum, s.get(sum)-1);
    }
}