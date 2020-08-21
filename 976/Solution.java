class Solution {
    public int largestPerimeter(int[] A) {
        int max=0;
        for(int i=0;i<A.length-2;i++)
            for(int j=i+1;j<A.length-1;j++)
                for(int k=j+1;k<A.length;k++){
                    max = Math.max(max, p(A[i], A[j], A[k]));
                }
        return max;
    }
    private int p(int a, int b, int c){
        if(a>=b+c || a<=Math.abs(b-c)) return 0;
        else return a+b+c;
    }
}