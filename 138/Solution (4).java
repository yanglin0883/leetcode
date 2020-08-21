/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Map<Node, Node> toNew = new HashMap();
        for(Node i=head;i!=null;i=i.next){
            if(!toNew.containsKey(i)) toNew.put(i, new Node(i.val));
            if(i.random!=null){
                if(!toNew.containsKey(i.random)) toNew.put(i.random, new Node(i.random.val));
                toNew.get(i).random = toNew.get(i.random);
            }
            if(i.next!=null){
                if(!toNew.containsKey(i.next)) toNew.put(i.next, new Node(i.next.val));
                toNew.get(i).next = toNew.get(i.next);
            }
        }
        return toNew.get(head);
    }
    
    void print(Node head){
        while(head!=null){
            System.out.print("  "+head.val);
            if(head.random==null)System.out.print(" n ");
            else System.out.print(head.random.val);
            head = head.next;
        }
        System.out.println();
    }
}