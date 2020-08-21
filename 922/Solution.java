class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int odd = A.length-1;//odd
        for(int i=0;i<A.length;i+=2){
            if(A[i]%2==0) continue;
            while(A[odd]%2==1) odd-=2;
            int temp = A[odd];
            A[odd] = A[i];
            A[i] = temp;
        }
        return A;
    }
}