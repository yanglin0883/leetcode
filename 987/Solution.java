/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Node{
        TreeNode tn;
        int y,x;
        Node(TreeNode node, int a,int b){
            tn = node;
            y=b;x=a;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Map<Integer, List<Node>> map = new TreeMap();
        Queue<Node> bfs = new LinkedList();
        bfs.offer(new Node(root, 0,0));
        while(!bfs.isEmpty()){
            Node temp = bfs.poll();
            if(!map.containsKey(temp.y)) map.put(temp.y, new ArrayList());
            map.get(temp.y).add(temp);
            if(temp.tn.left!=null) bfs.offer(new Node(temp.tn.left,temp.x+1, temp.y-1));
            if(temp.tn.right!=null) bfs.offer(new Node(temp.tn.right,temp.x+1, temp.y+1));
        }
        
        List<List<Integer>> res = new ArrayList();
        for(int i:map.keySet()){
            List<Node> temp = map.get(i);
            Collections.sort(temp, (p1, p2)->{
                if(p1.x==p2.x) return p1.tn.val-p2.tn.val;
                return p1.x-p2.x;
            });
            List<Integer> t2 = new ArrayList();
            for(Node j:temp) t2.add(j.tn.val);
            res.add(t2);
        }
        return res;
    }
}