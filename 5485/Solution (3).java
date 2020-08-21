class Solution {
    public int longestAwesome(String s) {
        int[] phase = new int[1024];
        Arrays.fill(phase, 1000000);
        int ans=0, cur=0;
        phase[0]=-1;
        for(int i=0;i<s.length();i++){
            cur ^= 1<<(s.charAt(i)-'0');
            phase[cur] = Math.min(i, phase[cur]);
            ans = Math.max(ans, i-phase[cur]);
            for(int j=0;j<10;j++){
                ans = Math.max(ans, i-phase[cur^(1<<j)]);
            }
        }
        return ans;
    }
}