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
    public TreeNode balanceBST(TreeNode root) {
        dfs(root);
        return df(0, data.size()-1);
    }
    ArrayList<Integer> data = new ArrayList();
    void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.left);
        data.add(root.val);
        dfs(root.right);
    }
    TreeNode df(int start, int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode res = new TreeNode(data.get(mid));
        res.left = df(start, mid-1);
        res.right = df(mid+1, end);
        return res;
    }
}