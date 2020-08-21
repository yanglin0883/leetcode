class Solution {
    public int minCostToMoveChips(int[] chips) {
        int a1=0, a2=0;
        for(int i=0;i<chips.length;++i){
            if(chips[i]%2==1) a1++;
            else a2++;
        }
        return Math.min(a1, a2);
    }
}