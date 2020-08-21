class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int ans[] = new int[queries.length];
        int sum=0;
        for(int j=0;j<A.length;j++)
            if((A[j]&1) ==0) sum += A[j];
        for(int i=0;i<ans.length;i++){
            //System.out.println(sum);
            if(A[queries[i][1]]%2==0){
                if(queries[i][0]%2==0){
                    sum+=queries[i][0];
                }
                else{                    
                    sum -= A[queries[i][1]];
                }
            }
            else{
                if(queries[i][0]%2!=0){
                    sum+=queries[i][0]+A[queries[i][1]];
                }
            }
            ans[i] = sum;
            A[queries[i][1]] += queries[i][0];            
        }
        return ans;
    }
}