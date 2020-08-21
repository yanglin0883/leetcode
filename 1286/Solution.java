class CombinationIterator {

    public CombinationIterator(String characters, int combinationLength) {
        dfs(characters,0,  combinationLength, new StringBuilder());
    }
    PriorityQueue<String> res = new PriorityQueue();
    void dfs(String c, int cur,  int n, StringBuilder sb){
        if(sb.length()==n){
            res.offer(sb.toString());
            return;
        }
        for(int i=cur;i<c.length();i++){
            sb.append(c.charAt(i));
            dfs(c, i+1, n, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    public String next() {
        return res.poll();
    }
    
    public boolean hasNext() {
        return !res.isEmpty();
    }
}

/**
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */