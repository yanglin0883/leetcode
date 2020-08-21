class Solution {
    public int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int temp = -30000;
        for(int i=0;i<N;i++){
            if(S.charAt(i) == C) temp = i;
            ans[i] = i-temp;
        }
        temp = 30000;
        for(int i=N-1;i>-1;i--){
            if(S.charAt(i) == C) temp = i;
            ans[i] = Math.min(ans[i],temp - i);
        }
        return ans;
    }
}