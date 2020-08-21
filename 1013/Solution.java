class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum= 0;
        for(int i:A)sum+=i;
        if(sum%3!=0) return false;
        sum/=3;
        int temp=0, part=0;
        for(int i: A){
            temp+=i;
            if(temp==sum){
                part++;
                temp=0;
            }
        }
        return part==3;
    }
}