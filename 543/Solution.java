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
    private class MaxValue{
        int maxOne;
        int maxSum;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        return doit(root).maxSum-1;
    }
    
    private MaxValue doit(TreeNode root){
        MaxValue res = new MaxValue();
        if(root==null) return res;
        MaxValue left=new MaxValue();
        MaxValue right=new MaxValue();
        if(root.left!=null){
            left = doit(root.left);
        }
        if(root.right!=null){
            right = doit(root.right);
        }
        res.maxOne = Math.max(left.maxOne, right.maxOne)+1;
        res.maxSum = max(left.maxOne+right.maxOne+1, left.maxSum, right.maxSum);
        //System.out.println(root.val+" :: "+res.maxOne+"  "+res.maxSum);
        return res;
    }
    int max(int a, int b, int c){
        a= (a>b)?a:b;
        return (a>c)?a:c;
    }
}