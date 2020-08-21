class RecentCounter {
    LinkedList<Integer> ps = new LinkedList<>();

    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        ps.add(t);
        while(!ps.isEmpty()){
            if(t-ps.peek()<=3000) break;
            ps.poll();
        }
        return ps.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */