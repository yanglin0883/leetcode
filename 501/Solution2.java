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
    public int[] findMode(TreeNode root) {
        dfs(root);
        int[] ans = new int[res.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = res.get(i);
        return ans;
    }
    ArrayList<Integer> res = new ArrayList<Integer>();
    TreeNode pre;
    int cur=0, max=0;
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(pre==null || pre!=null&&pre.val==root.val){
            cur++;
        }
        else 
            cur=1;
        if(cur == max) res.add(root.val);
        else if(cur>max){
            max = cur;
            res = new ArrayList<Integer>();
            res.add(root.val);
        }
        pre = root;
        dfs(root.right);
    }
}