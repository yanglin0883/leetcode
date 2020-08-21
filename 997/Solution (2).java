class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] inorder = new int[N];
        int[] outorder = new int[N];
        for(int[] i: trust){
            inorder[i[0]-1]++;
            outorder[i[1]-1]++;
        }
        for(int i=0;i<N;i++){
            if(inorder[i]==0 && outorder[i]==N-1){
                return i+1;
            }
        }
        return -1;
    }
}