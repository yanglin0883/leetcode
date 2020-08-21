/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        ArrayList<Node> old = new ArrayList<>();
        while(head!=null){
            old.add(head);
            head = head.next;
        }
        ArrayList<Node> n = new ArrayList<>();
        for(Node i: old){
            n.add(new Node(i.val, null, null));
        }
        for(int i=0;i<n.size()-1;i++){
            n.get(i).next = n.get(i+1);
        }
        //old.add(null);n.add(null);
        for(int i=0;i<n.size();i++){
            if(old.get(i).random!=null)
                n.get(i).random = n.get(old.indexOf(old.get(i).random));
        }
        return n.get(0);
    }
}