/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        HashMap<Node, Node> toNew = new HashMap();
        Queue<Node> bfs = new LinkedList();
        Set<Node> visited = new HashSet();
        bfs.offer(node);
        visited.add(node);
        while(!bfs.isEmpty()){
            Node temp = bfs.poll();
            toNew.put(temp, new Node(temp.val));
            for(Node nei:temp.neighbors){
                if(visited.contains(nei))continue;
                bfs.offer(nei);
                visited.add(nei);
            }
        }
        
        bfs.offer(node);
        visited.clear();
        visited.add(node);
        while(!bfs.isEmpty()){
            Node temp = bfs.poll();
            for(Node nei : temp.neighbors){
                toNew.get(temp).neighbors.add(toNew.get(nei));
                if(visited.contains(nei))continue;
                bfs.offer(nei);
                visited.add(nei);
            }
        }
        return toNew.get(node);
    }
}