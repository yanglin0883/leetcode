/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        ArrayList<Node> nodes = getNodes(node);
        
        Map<Node, Node> toNew = new HashMap<>();
        for(Node n:nodes){
            toNew.put(n, new Node(n.val, new ArrayList<Node>()));
        }
        for(Node n:nodes){
            List<Node>temp = toNew.get(n).neighbors;
            for(Node nei:n.neighbors){
                temp.add(toNew.get(nei));
            }
        }
        return toNew.get(node);
    }
    ArrayList<Node> getNodes(Node node){
        ArrayList<Node> res = new ArrayList<>();
        Queue<Node> bfs = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        bfs.offer(node);
        visited.add(node);
        while(!bfs.isEmpty()){
            Node n = bfs.poll();
            res.add(n);
            for(Node nei:n.neighbors){
                if(!visited.contains(nei)){
                    bfs.offer(nei);
                    visited.add(nei);
                }
            }
        }
        return res;
    }
}