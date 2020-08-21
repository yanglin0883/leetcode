class Solution {
    public int numTrees(int n) {
        //dp=new int[n+1];
        return helper(n);
    }
    private int helper(int n){
        if(n==1) return 1;
        if(n==0) return 0;
        int total = 0;
        for(int i=1;i<=n;i++){
            int left = helper(i-1);
            int right = helper(n-i);
            if(left==0) total += right;
            else if(right==0) total+=left;
            else  total += left*right;
        }
        //System.out.println(n+" "+total);
        return total;
    }
}
//time limit exceeded at 18 as input