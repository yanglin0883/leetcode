class Solution {
    public int numTrees(int n) {
        // if(n<1) return 1;
        me = new int[n+1];
        Arrays.fill(me,-1);
        return dfs(n);
    }
    
    private int me[];
    private int dfs(int n){        
        if(n<=1) return 1;
        int res=0;
        int a, b;
        for(int i=0;i<n;i++){
            // System.out.println(i+" "+Arrays.toString(me));
            if(me[i]==-1){
                a=dfs(i-0);
                me[i] = a;
                // System.out.println(a+" + "+i);
            }
            else a = me[i];
            
            if(me[n-i-1]==-1){               
                b=dfs(n-i-1);
                me[n-i-1] = b;
            }
            else b = me[n-i-1];
            res += a * b;
        }
        return res;
    }
}