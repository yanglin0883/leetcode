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
    class Inner{
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        boolean flag=true;
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root).flag;
    }
    private Inner helper(TreeNode root){
        Inner ans = new Inner();
        if(root==null) return ans;
        ans.max = root.val;
        ans.min = root.val;
        if(root.left!=null){
            Inner temp = helper(root.left);
            ans.flag &= temp.flag;
            if(temp.max>=root.val) ans.flag = false;
            ans.min = Math.min(temp.min, ans.min);
        }
        if(root.right!=null){
            Inner temp = helper(root.right);
            ans.flag &= temp.flag;
            if(temp.min<=root.val) ans.flag = false;
            ans.max = Math.max(temp.max, ans.max);
        }
        //System.out.println(ans.min+"  "+ans.max);
        return ans;
    }
}