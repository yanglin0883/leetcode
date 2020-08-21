class MedianFinder {

    /** initialize your data structure here. */
    public MedianFinder() {
        
    }
    PriorityQueue<Integer> min_heap = new PriorityQueue<Integer>((p1, p2)->p1-p2);
    PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(((p1,p2)->p2-p1));
    public void addNum(int num) {
        max_heap.offer(num);
        min_heap.offer(max_heap.poll());
        if(max_heap.size()<min_heap.size())
            max_heap.add(min_heap.poll());
        
//         System.out.println("label: ");
//         System.out.println(min_heap);
//         System.out.println(max_heap);
    }
    
    public double findMedian() {
        if(min_heap.size()==max_heap.size()) return (min_heap.peek().doubleValue()+max_heap.peek())/2;
        else return max_heap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */