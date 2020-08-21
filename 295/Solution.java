class MedianFinder {

    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    ArrayList<Integer> store = new ArrayList();
    public void addNum(int num) {
        store.add(num);
    }
    
    public double findMedian() {
        Collections.sort(store);
        int n=store.size();
        return ((n&1)==1) ? store.get(n/2):((double)store.get(n/2-1)+store.get(n/2))*0.5;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */