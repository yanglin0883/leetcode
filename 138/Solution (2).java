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
        Map<Node, Node> toNew = new HashMap<>();
        Map<Node, Node> toOld = new HashMap<>();
        Node old = head;
        while(head!=null){
            Node temp = new Node(head.val, null, null);
            toNew.put(head, temp);
            toOld.put(temp, head);
            head = head.next;
        }
        for(head=old;head!=null;head = head.next){
            Node temp = toNew.get(head);
            if(head.next!=null)temp.next = toNew.get(head.next);
            if(head.random!=null) temp.random = toNew.get(head.random);
        }
        return toNew.get(old);
    }
}