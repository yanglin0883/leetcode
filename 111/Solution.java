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
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        int depth = 0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            depth++;
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(temp.left==null&&temp.right==null) return depth;
                if(temp.left!=null)bfs.offer(temp.left);
                if(temp.right!=null)bfs.offer(temp.right);
            }
        }
        return depth+1;
    }
}