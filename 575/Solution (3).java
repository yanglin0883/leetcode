class Solution {
    public int distributeCandies(int[] candies) {
        boolean kinds[] = new boolean[200001];
        int res =0, half = candies.length/2;
        for(int i=0;i<candies.length && res<half;i++){
            if(!kinds[candies[i]+100000]){
                kinds[candies[i]+100000] = true;
                res++;
            }
        }
        return res;
    }
}