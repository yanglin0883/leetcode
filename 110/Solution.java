/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //错在理解题目， balanced是每个节点的左右比较
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int firstDep = 0;
        int depth =0;
        boolean flag = false;
        LinkedList<TreeNode> bfs = new LinkedList<TreeNode>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            depth++;
            if(!flag) firstDep++;
            int size = bfs.size();
            for(int i=0;i<size;i++){
                TreeNode temp = bfs.poll();
                if(temp.left==null||temp.right==null){
                    if(!flag){
                        flag = true;
                        System.out.println(temp.val);
                    } 
                }
                if(temp.left!=null) bfs.offer(temp.left);
                if(temp.right!=null) bfs.offer(temp.right);
            }  
            System.out.println(depth+" "+firstDep+"  "+flag);
            if(depth>firstDep+1) return false;
        }
        return true;
    }
}