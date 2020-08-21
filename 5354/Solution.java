class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        if(n==1) return 0;
        ArrayList[] son = new ArrayList[n];
        for(int i=0;i<n;i++){
            if(manager[i]!=-1){
                if(son[manager[i]]==null) son[manager[i]] = new ArrayList();
                son[manager[i]].add(i);
            }
        }
        // for(int i=0;i<son.length;i++) System.out.println(son[i]);
        
        return dfs(headID, son, informTime);
    }
    int dfs(int root, ArrayList[] son, int[] val){
        int max = 0;
        // System.out.println(root+"  "+ val[root]);
        if(son[root]!=null)for(Object o: son[root]){
            max = Math.max(max, dfs((Integer)o, son, val));
        }
        // System.out.println(max+"    ");
        return max+val[root];
    }
}