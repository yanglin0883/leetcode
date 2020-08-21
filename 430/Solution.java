/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/
class Solution {
    public Node flatten(Node head) {
        if(head==null) return null;
        Node node = head;
        Node next;
        while(node!=null){
            next = node.next;
            if(node.child!=null){
                node.next = flatten(node.child);
                node.child = null;
                node.next.prev = node;
                while(node.next!=null) node = node.next;
                node.next = next;
                if(next!=null)next.prev = node;                
            }
            node = node.next;
        }
        
        // for(next = head;next.next!=null;next = next.next)
        //     System.out.print(next.val+"  ");
        // System.out.println();
        // for(;next.prev!=null;next = next.prev)
        //     System.out.print(next.val+"  ");
        // System.out.println();
        return head;
    }
}