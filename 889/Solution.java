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
    public TreeNode constructFromPrePost(int[] pre, int[] post) {
        if(pre==null||pre.length==0) return null;
        TreeNode cur = new TreeNode(pre[0]);
        if(pre.length==1) return cur;
        int i=1;
        // for(int j:pre) System.out.print(j+"  ");
        // System.out.println();
        // for(int j:post) System.out.print(j+"  ");
        // System.out.println("end");
        if(pre[1]==post[post.length-2]){
		// this part can be form randomly
            int[] preLeft = Arrays.copyOfRange(pre, 1, pre.length);
            int[] postLeft = Arrays.copyOfRange(post, 0, post.length-1);
            cur.left = constructFromPrePost(preLeft, postLeft);
            return cur;
        }
        for(;i<pre.length;i++){
            if(pre[i]==post[post.length-2]) break;
        }
        int[]preLeft = Arrays.copyOfRange(pre, 1, i);
        int[]preRight = Arrays.copyOfRange(pre, i, pre.length);
        i=post.length-2;
        for(;i>-1;i--){
            if(post[i]==pre[1]) break;
        }
        int[]postLeft = Arrays.copyOfRange(post, 0, i+1);
        int[]postRight = Arrays.copyOfRange(post, i+1, post.length-1);
        cur.left = constructFromPrePost(preLeft, postLeft);
        cur.right = constructFromPrePost(preRight, postRight);
        return cur;
    }
}