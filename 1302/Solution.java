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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null) return 0;
        ArrayList<Integer> level = new ArrayList<>();
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            level = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                level.add(node.val);
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null)bfs.offer(node.right);
            }
            //System.out.println(level);
        }
        int sum=0;
        for(Integer i: level)
            sum = sum+i;
        return sum;
    }
}