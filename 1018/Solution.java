class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        int temp = A[0];
        ArrayList<Boolean> res = new ArrayList<>();
        res.add(temp==0);
        int[] two = {6, 2, 4, 8};
        for(int i=1;i<A.length;i++){
            if(A[i] == 1) {
            temp += two[i%4];
            temp %= 5;}
            System.out.println(temp);
            res.add(temp==0);
        }
        return res;
    }
}