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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        Queue<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size =  bfs.size()-1;
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
            TreeNode node = bfs.poll();
            if(node.left!=null) bfs.offer(node.left);
            if(node.right!=null) bfs.offer(node.right);
            res.add(node.val);
        }
        return res;
    }
}