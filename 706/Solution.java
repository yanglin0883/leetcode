class MyHashMap {
    int len=0;
    int[] keyList =new int[10001];
    int[] valueList = new int[10001];
    boolean[] exist = new boolean[10001];
    /** Initialize your data structure here. */
    public MyHashMap() {
        
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        for(int i=0;i<len;i++){
            if(key==keyList[i]&&exist[i]){
                valueList[i] = value;
                return;
            }
        }
        exist[len] = true;
        keyList[len] = key;
        valueList[len++] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        for(int i=0;i<len;i++)
            if(keyList[i]==key&&exist[i])
                return valueList[i];
        return -1;
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        for(int i=0;i<len;i++)
            if(keyList[i]==key&&exist[i]){
                exist[i] = false;
                break;
            }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */