class Solution {
    public int[] countBits(int num) {
        if(num==0) return new int[1];
        int[] res = new int[num+1];
        res[1] = 1;
        for(int i=2;i<=num;i++){
            res[i] = res[getIndex(i)]+1;
            // System.out.println();
        }
        return res;
    }
    int getIndex(int n){
        int i = Integer.highestOneBit(n);
        // System.out.println(i+" + "+n);
        return n^i;
    }
}