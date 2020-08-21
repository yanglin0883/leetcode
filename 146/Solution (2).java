class LRUCache {

    class Node{
        int val,key;
        Node next, pre;
        Node(int x){
            val = x;
        }
    }
    int capacity;
    Map<Integer, Node> map = new HashMap();
    Node left = new Node(0);
    Node right = new Node(0);
    public LRUCache(int capacity) {
        this.capacity = capacity;   
        left.next = right;
        right.pre = left;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node cur = map.get(key);
            cur.pre.next = cur.next;
            cur.next.pre = cur.pre;
            cur.pre = left;
            cur.next = left.next;
            left.next.pre = cur;
            left.next = cur;
            return cur.val;
        }else 
            return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node cur = map.get(key);
            cur.pre.next = cur.next;
            cur.next.pre = cur.pre;
            cur.pre = left;
            cur.next = left.next;
            left.next.pre = cur;
            left.next = cur;
            cur.val = value;
        }else{
            if(capacity==0){
                Node temp = right.pre;
                map.remove(temp.key);
                right.pre = temp.pre;
                right.pre.next = right;
            }
            else capacity--;
            
            Node cur = new Node(value);
            cur.key = key;
            map.put(key, cur);
            cur.next = left.next;
            cur.pre = left;
            left.next.pre = cur;
            left.next = cur;
            
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */