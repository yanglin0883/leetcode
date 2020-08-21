class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i=0;i<ans.length;i++){
            A[queries[i][1]] += queries[i][0];
            for(int j=0;j<A.length;j++)
                if((A[j]&1) ==0) ans[i] += A[j];
        }
        return ans;
    }
}