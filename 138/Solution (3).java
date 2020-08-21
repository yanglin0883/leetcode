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
        Node p1 = head;
        Node dummy = new Node(0);
        Node p2 = dummy;
        while(p1!=null){
            p2.next = new Node(p1.val);
            p2 = p2.next;
            p2.random = p1.random;
            p1 = p1.next;
        }
        p2=dummy;
        p1 =head;
        while(p1!=null){
            Node next2 = p2.next;
            p2.next =p1;
            Node next1 = p1.next;
            p2 = next2;
            p1.next = p2;
            p1 = next1;
        }
        p2=dummy.next.next;
        while(p2!=null){
            if(p2.random!=null)p2.random = p2.random.next;
            if(p2.next==null)p2 = null;
            else    p2 = p2.next.next;
        }
        p1=dummy;
        while(p1!=null){
                Node next = p1.next;
                if(p1.next!=null)p1.next = p1.next.next;
                p1 = next;
        }
        return dummy.next;
    }
}