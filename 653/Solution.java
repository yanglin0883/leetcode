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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> a = transToArray( root );
        for( int i=0; i<a.size()-1; i++ ){
            for( int j=i+1; j<a.size(); j++ ){
                if( a.get(i) + a.get(j) == k ) return true;
            }
        }
        return false;
    }
    
    public ArrayList<Integer> transToArray( TreeNode root ){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        if( root == null ) return arr;
        trans(root, arr);
        return arr;
    }
    
    private void trans( TreeNode root, ArrayList<Integer> arr ){
        if( root == null ) return;
        arr.add( root.val );
        //System.out.println(root.val);
        trans( root.left, arr );
        trans( root.right, arr );
    }
}