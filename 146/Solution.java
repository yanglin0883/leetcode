class LRUCache {
    int[][] cache;
    int rear=0;
    public LRUCache(int capacity) {
        cache = new int[capacity][2];
        for(int i=0;i<capacity;i++){
            cache[i][0] = Integer.MIN_VALUE;
            cache[i][1] = Integer.MIN_VALUE;
        }
    }
    
    public int get(int key) {
        for(int i=0;i<cache.length;i++){
            if(cache[i][0]==key) {
                int res =cache[i][1];
                changeToTop(i);
                return res;
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        for(int i=0;i<rear;i++){
            if(cache[i][0]==key){
                cache[i][1] = value;
                changeToTop(i);
                return;
            }
        }
        if(rear<cache.length){
            cache[rear][0] = key;
            cache[rear][1] = value;
            changeToTop(rear);
            rear++;
        }else{
            cache[rear-1][0] = key;
            cache[rear-1][1] = value;
            changeToTop(rear-1);
        }
    }
    void changeToTop(int k){
        int[] temp = cache[k];
        for(int i=k;i>0;i--)
            cache[i] = cache[i-1];
        cache[0] = temp;
        // for(int[] t:cache) System.out.print(",   "+t[0]+" :"+t[1]);
        // System.out.println();
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */