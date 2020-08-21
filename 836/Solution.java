class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(!isRec(rec1[0], rec1[1], rec1[2], rec1[3]) || !isRec(rec2[0], rec2[1], rec2[2], rec2[3]))
            return false;
        if(rec2[0]<=rec1[0]){
            if(rec2[1]<rec1[1])
                return isRec(rec1[0], rec1[1], rec2[2], rec2[3]);
            else
                return isRec(rec1[0], rec1[1], rec2[2], rec2[3]) 
                && isRec(rec2[0], rec2[1], rec1[2], rec1[3]);
        }
        else{
            if(rec2[1]<rec1[1])
                return isRec(rec1[0], rec1[1], rec2[2], rec2[3]) 
                && isRec(rec2[0], rec2[1], rec1[2], rec1[3]);
            else
                return isRec(rec2[0], rec2[1], rec1[2], rec1[3]) ;
        }
    }
    private boolean isRec(int a, int b, int c, int d){
        return a<c && b<d;
    }
}