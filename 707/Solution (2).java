class MyLinkedList {

    /** Initialize your data structure here. */
    public MyLinkedList() {
        head = new ListNode(0);
    }
    ListNode head;
    class ListNode{
        ListNode(int v){
            val =v;
        }
        ListNode(int v, ListNode n){
            val = v;
            next = n;
        }
        int val;
        ListNode next=null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        ListNode p = head;
        for(int i=0;i<=index;i++){
            p = p.next;
            if(p==null) return -1;
        }

        return p.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        head.next = new ListNode(val, head.next);
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode p = head;
        while(p.next!=null)p = p.next;
        p.next = new ListNode(val);
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode p = head;
        for(int i=0;i<index;i++){
            p = p.next;
            // if(p==null) return Integer.MIN_VALUE;
        }
        p.next = new ListNode(val, p.next);
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        ListNode p = head;
        for(int i=0;i<index;i++){
            p = p.next;
            // if(p==null) return Integer.MIN_VALUE;
        }        
        if(p.next==null) return ;
        p.next = p.next.next;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */