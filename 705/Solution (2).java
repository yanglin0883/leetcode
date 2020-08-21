class MyHashSet {
    int n = 20000;
    int[] set = new int[n];
    int count=0;
    /** Initialize your data structure here. */
    public MyHashSet() {
        // count++;
    }
    
    public void add(int key) {
        // count++;
        key++;
        // System.out.println("  + add "+ key+Arrays.toString(set) );
        int start = key %n;
        while(set[start]>0){if(set[start]==key)return;start++;if(start>=n)start %=n;}
        set[start] = key;
    }
    
    public void remove(int key) {
        key++;
        // count++;
        // System.out.println("  + remove "+ key+Arrays.toString(set) );
        int start = key%n;
        while(set[start]!=0){
            if(set[start]==key){
                set[start] = -1;
                return;
            }
            start++;
            if(start>=n)start%=n;
        }
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        key++;
        // System.out.println(++count+"  + contains "+ key+Arrays.toString(set) );
        int start = key%n;
        while(set[start]!=0){
            if(set[start]==key)
                return true;
            start++;
            if(start>=n)start%=n;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */