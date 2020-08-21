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
    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        for(int i=1;i<preorder.length;i++){
            TreeNode temp = new TreeNode(preorder[i]);
            if(preorder[i]<stack.peek().val) {
                stack.peek().left = temp; 
            }
            else{
                TreeNode parent=stack.peek();
                while(!stack.isEmpty()&&stack.peek().val<preorder[i]){
                    parent = stack.pop();
                }
                parent.right = temp;
            }
            stack.push(temp);
        }
        return root;
    }
}