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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root==null) return res;
        target = sum;
        ArrayList<Integer> path = new ArrayList<Integer>();
        dfs(root, 0, path);
        return res;
    }
    int target;
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    void dfs(TreeNode root, int lastLevel, ArrayList<Integer> path){
        int sum = lastLevel + root.val;
        path.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==target)res.add(new ArrayList(path));
        }
        else{
            if(root.left!=null) dfs(root.left, sum, path);
            if(root.right!=null) dfs(root.right, sum, path);
        }
        path.remove(path.size()-1);
    }
}