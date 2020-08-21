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
    public int maxLevelSum(TreeNode root) {
        int res=1, max = root.val ,level=1;
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size(), sum=0;
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                sum+=node.val;
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null) bfs.offer(node.right);
            }
            if(sum>max){
                res = level;
                max =sum;
            }
            level++;
        }
        return res;
    }
}