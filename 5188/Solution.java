class TreeAncestor {
    int[]p;
    public TreeAncestor(int n, int[] parent) {
        p = parent;
        
    }
    
    public int getKthAncestor(int node, int k) {
        while(p[node]!=-1){
            if(k==1) return p[node];
            node = p[node];
            k--;
        }
        return -1;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */