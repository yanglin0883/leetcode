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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        TreeNode dep = new TreeNode(0);
        int maxDepth = dfs(root, dep, 0);
        // sop(dep);
        Queue<TreeNode[]> bfs = new LinkedList();
        TreeNode[] a = {root, dep};
        bfs.offer(a);
        TreeNode res = root;
        while(!bfs.isEmpty()){
            int size = bfs.size();
            ArrayList<TreeNode> temp = new ArrayList();
            for(int i=0;i<size;i++){
                TreeNode[] node = bfs.poll();
                // System.out.println(Arrays.toString(node));
                if(node[1].val == maxDepth) temp.add(node[0]);
                if(node[0].left != null) bfs.offer(new TreeNode[]{node[0].left, node[1].left}); 
                if(node[0].right!= null)bfs.offer(new TreeNode[]{node[0].right,node[1].right});
            }
            // System.out.println(temp);
            if(temp.size()==1) res =  temp.get(0);
            if(temp.size()>1) return res;
        }
        return res;
    }
    int dfs(TreeNode root, TreeNode dep, int d){
        if(root.left==null&&root.right ==null) {dep.val = d;return d;}
        int left = 0, right=0;
        if(root.left!=null) {
            dep.left = new TreeNode(0);
            left = dfs(root.left, dep.left, d+1);
        }
        if(root.right!=null){
            dep.right = new TreeNode(0);
            right=dfs(root.right, dep.right,d+1);
        }
        dep.val = Math.max(left, right);
        // System.out.println(root.val+" "+dep.val);
        return dep.val;
    }
    void sop(TreeNode root){
        Queue<TreeNode> bfs = new LinkedList();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            int size = bfs.size();
            for(int i=0;i<size;i++){
                TreeNode node = bfs.poll();
                if(node.left!=null) bfs.offer(node.left);
                if(node.right!=null)bfs.offer(node.right);
                System.out.print(node.val+"  ");
            }
            System.out.println();
        }
    }
}