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
        int res=0;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            res = bfs.peek().val;
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(temp.left != null) bfs.offer(temp.left);
                if(temp.right != null) bfs.offer(temp.right);
            }
        }
        return res;
    }
}