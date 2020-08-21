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
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if(d==1){
            TreeNode res = new TreeNode(v);
            res.left = root;
            return res;
        }
        Queue<TreeNode> bfs=new LinkedList<>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            d--;
            int size = bfs.size();
            System.out.println(d);
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                if(d==1){
                    if(true) {
                        TreeNode temp = new TreeNode(v);
                        temp.left = node.left;
                        node.left = temp;
                    }
                    if(true) {
                        TreeNode temp = new TreeNode(v);
                        temp.right = node.right;
                        node.right = temp;
                    }
                }
                else{
                    if(node.left!=null) bfs.offer(node.left);
                    if(node.right!=null) bfs.offer(node.right);
                }
            }
            if(d==1) return root;
        }
        return root;
    }
}