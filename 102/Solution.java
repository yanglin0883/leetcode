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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList();
        if(root == null) return res;
        Queue<TreeNode> bfs = new LinkedList();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int len = bfs.size();
            ArrayList<Integer> temp = new ArrayList();
            for(int i=0;i<len;i++){
                TreeNode node = bfs.poll();
                temp.add(node.val);
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}