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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> bfs = new LinkedList();
        bfs.offer(root);
        boolean isX=false, isY=false;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            isX=false; isY=false;
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(temp.val==x)isX=true;
                if(temp.val==y)isY=true;
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
                if(temp.left!=null && temp.right!=null && (temp.left.val==x && temp.right.val==y 
                   || temp.left.val==y && temp.right.val==x)) return false;
            }
            if(isX&&isY) return true;
            if(isX||isY) return false;
        }
        return false;
    }
}