class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int S=0;
        for(int x:A) S+=x;
        long ans1 = kadane(A,0, A.length-1, 1),
        ans2 = S+kadane(A, 1, A.length-1, -1),
        ans3  = S+kadane(A, 0, A.length-2,-1);
        
        return (int)Math.max(ans1, Math.max(ans2, ans3));
    }
    
    long kadane(int[] A, int i , int j, int sign){
        long ans = Integer.MIN_VALUE, cur = Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            cur = sign*A[k] + Math.max(cur, 0);
            ans = Math.max(ans, cur);
        }
        // System.out.println(ans);
        return ans;
    }
}