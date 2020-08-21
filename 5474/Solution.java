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
    public int countPairs(TreeNode root, int distance) {
        d= distance;
        dfs(root);
        return res;
    }
    int d=0;
    int res=0;
    int[] dfs(TreeNode root){
        if(root==null) return null;
        if(root.left==null && root.right==null) return new int[]{1};
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        if(left==null){
            for(int i=0;i<right.length;i++)
                right[i]++;
            return right;
        }
        if(right==null){
            for(int i=0;i<left.length;i++)
                left[i]++;
            return left;
        }
        // System.out.println(Arrays.toString(left)+"  "+Arrays.toString(right)+" "+ root.val);
        for(int i=0;i<left.length;i++){
            for(int j=0;j<right.length;j++){
                if(left[i]+right[j]<=d) res++;
            }
        }
        int[] res = new int[left.length+right.length];
        int i=0;
        for(i=0;i<left.length;i++)
            res[i] = left[i]+1;
        for(;i<left.length+right.length;i++)
            res[i] = right[i-left.length]+1;
        return res;
    }
}