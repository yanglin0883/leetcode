class Solution {
    public int numberOfArrays(String s, int k) {
        if(s.length()==1) return 1;
        this.s = s;
        this.k = k;
        memo = new long[s.length()];
        Arrays.fill(memo, -1);
        count = dfs(0);
        return (int)(count%mod);
    }
    int mod  = 1000000007;
    int k;
    String s;
    long count=0;
    long[] memo;
    long dfs(int cur){
        if(cur==s.length())return 1;
        if(memo[cur]!=-1) return memo[cur];
        long ans=0;
        for(int end=cur+1;end<=s.length();end++){
            if(end-cur>11||new Long(s.substring(cur,end))>k)break;
            if(end!=s.length() && s.charAt(end)=='0')continue;
            ans+=dfs(end);
        // System.out.println(cur+"  "+end+"  "+ans);
        }
        ans%=mod;
        memo[cur] = ans;
        return ans;
    }
}