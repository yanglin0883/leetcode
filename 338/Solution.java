class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num+1];
        for(int i=0;i<=num;i++){
            res[i] = count(i);
        }
        return res;
    }
    private int count(int i){
        int res=0;
        while(i!=0){
            res += i & 1;
            i>>>=1;
        }
        return res;
    }
}