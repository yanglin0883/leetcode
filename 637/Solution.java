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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        if(root==null) return res;
        LinkedList<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            double aver = 0;
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                aver += temp.val;
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }
            aver /= (double)size;
            res.add(aver);
        }
        return res;
    }
}