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
    HashMap<Integer, Integer> imap;
    int[]post;
        
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||inorder.length==0) return null;
        imap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            imap.put(inorder[i], i);
        }
        post = postorder;
        return build(0, inorder.length-1, 0, postorder.length-1);
    }
    
    TreeNode build(int inLo, int inHi, int postLo, int postHi){
        if(inLo>inHi) return null;
        if(inLo==inHi) return new TreeNode(post[postHi]);
        int value = post[postHi];
        int index = imap.get(value);
        int leftLen = index-inLo;
        int rightLen = inHi-index;
        TreeNode root = new TreeNode(value);
        root.left = build(inLo, inLo+leftLen-1, postLo, postLo+leftLen-1);
        root.right = build(inHi-rightLen+1, inHi, postLo+leftLen, postHi-1);
        return root;
    }
}