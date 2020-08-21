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
    public int[] findMode(TreeNode root) {
        dfs(root);
        Integer max=0;
        for(Integer i: hm.keySet()){
            if(hm.get(i)>max) max = hm.get(i);
        }
        ArrayList<Integer> res  = new ArrayList<Integer>();
        for(Integer i: hm.keySet()){
            if(hm.get(i)==max) res.add(i);
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = res.get(i).intValue();
        return ans;
    }
    HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(hm.containsKey(root.val))
            hm.put(root.val, hm.get(root.val)+1);
        else
            hm.put(root.val, 1);
        dfs(root.right);
    }
}