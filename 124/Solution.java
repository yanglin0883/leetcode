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
    public int maxPathSum(TreeNode root) {
        int[] res = dfs(root);
        return res[0];
    }
    
    int[] dfs(TreeNode root){
        if(root==null) return null;
        int[] res = new int[2];// max and max lib to this node
        int[] left = dfs(root.left);
        int[]right = dfs(root.right);
        // System.out.println("left:"+Arrays.toString(left));
        // System.out.println("right:"+Arrays.toString(right));
        if(left==null&&right==null){
            res[0] = root.val;
            res[1] = root.val;
            // return res;
        }
        else if(left==null){
            res[1] = right[1]>0?root.val+right[1]:root.val;
            res[0] = Math.max(right[0], res[1]);
            // return res;
        }
        else if(right==null){
            res[1] = left[1]>0?root.val+left[1]:root.val;
            res[0] = Math.max(left[0], res[1]);
            // return res;
        }else{ 
            if(left[1]<0)left[1]=0;
            if(right[1]<0)right[1]=0;           
            res[1] = Math.max(left[1], right[1])+root.val;
            res[0] = max(left[0], right[0], left[1]+root.val+right[1]);
            // System.out.println(left[1]+root.val+right[1]);
        }
        // System.out.println(Arrays.toString(res));
        return res;
    }
    int max(int a, int b, int c){
        return  Math.max(Math.max(a, b), c);
    }
}