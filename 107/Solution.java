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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
        if(root==null) return res;
        LinkedList<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode t = bfs.poll();
                temp.add(t.val);
                if(t.left!=null) bfs.offer(t.left);
                if(t.right!=null) bfs.offer(t.right);
            }
            res.addFirst(temp);
        }
        return res;
    }
}