class Solution {
    public int minDeletionSize(String[] A) {
        int N = A[0].length();
        int count=0;
        T1:for(int i=0;i<N;i++){
            for(int j=1;j<A.length;j++){
                if(A[j].charAt(i) < A[j-1].charAt(i)){
                    count++;
                    continue T1;
                } 
            }
        }
        return count;
    }
}