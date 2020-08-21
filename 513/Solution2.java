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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){            
                root = bfs.poll();
                if(root.right != null) bfs.offer(root.right); 
                if(root.left != null) bfs.offer(root.left);           
        }
        return root.val;
    }
}