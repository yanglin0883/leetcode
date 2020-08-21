class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0, min=Math.abs(A[0]);
        for(int i=0;i<A.length;i++){
            if(K!=0){
                if(A[i]<0) {K--; A[i] = -A[i];}
                else if(A[i]==0){
                    K=0;
                }
            }
            sum+=A[i];
            min = Math.min(min, A[i]);
        }
        sum -= 2*min *(K%2);
        //System.out.println(sum+"  "+min);
        return sum;
    }
}