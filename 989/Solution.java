class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        for(int i=A.length-1;i>-1;i--){
            K+=A[i];
            res.addFirst(K%10);
            K/=10;
        }
        while(K>0){
            res.addFirst(K%10);
            K/=10;
        }
        return res;
    }
}