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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        LinkedList<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        boolean flag = true;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            LinkedList<Integer> t = new LinkedList<Integer>();
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(flag) t.add(temp.val);
                else t.addFirst(temp.val);
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }
            res.add(t);
            flag = !flag;
        }
        return res;
    }
}