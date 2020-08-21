/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root ==null) return res;
        LinkedList<Node> bfs = new LinkedList<Node>();
        bfs.offer(root);
        while(!bfs.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            int size = bfs.size();
            for(int i=0;i<size;i++){
                Node node = bfs.poll();
                temp.add(node.val);
                for(Node chil: node.children){
                    bfs.offer(chil);
                }
            }
            res.add(temp);
        }
        return res;
    }
}