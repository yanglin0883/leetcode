class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        for(int i=0;i<S.length();i++){
            int min=10002;
            int back = i;
            while(back<S.length()){
                if(S.charAt(back) == C){
                    min = Math.min(min, back-i);
                    break;
                }
                back++;
            }
            int front=i;
            while(front>-1){
                if(S.charAt(front) == C){
                    min = Math.min(min, i-front);
                    break;
                }
                front--;
            }
            ans[i] = min;
        }
        return ans;
    }
}