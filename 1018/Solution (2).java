class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> res = new ArrayList<>();
        int temp=0;
        for(int i=0;i<A.length;i++){
            temp =  (temp*2+A[i])%5;
            res.add(temp==0);
        }
        return res;
    }
}