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
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> bfs = new LinkedList();
        int total=0;
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }
            total++;
        }
        return total;
    }
}