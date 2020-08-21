class FirstUnique {
    class Node{
        int val;
        Node next, pre;
        Node(){}
        Node(int x){
            val = x;
        }
    }
    Node head = new Node();
    Node tail = new Node();
    Map<Integer, Node> hm = new HashMap();

    public FirstUnique(int[] nums) {
        head.next = tail;
        tail.pre = head;
        for(int i: nums){
            addValue(i);
            // show();
        }
    }
    
    public int showFirstUnique() {
        // show();
        if(head.next==tail) return -1;
        else return head.next.val;
    }
    
    public void add(int value) {
        addValue(value);
        // show();
    }
    
    private void addValue(int i){        
        if(hm.containsKey(i)){
            Node temp = hm.get(i);
            if(temp==null)return;
            temp.pre.next = temp.next;
            temp.next.pre = temp.pre;
            hm.put(i, null); // also should delete it from the map, because its pointers still point to somewhere
        }else{
            Node t = new Node(i);
            t.pre = tail.pre;
            t.next = tail;
            tail.pre.next = t;
            tail.pre = t;
            hm.put(i, t);
        }
    }
    private void show(){
        for(Node i = head;i!=tail;i = i.next){
            System.out.print(i.val+"  ");
        }System.out.println();
    }
}

/**
 * Your FirstUnique object will be instantiated and called as such:
 * FirstUnique obj = new FirstUnique(nums);
 * int param_1 = obj.showFirstUnique();
 * obj.add(value);
 */