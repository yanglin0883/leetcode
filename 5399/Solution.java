class Solution {
    public String largestNumber(int[] cost, int target) {
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(cost[i]==cost[j]) {
                    cost[i] = -1;
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(cost));
        String dp[] = new String[target+1];
        dp[0] = "";
        for(int i=0;i<dp.length;i++){
            if(dp[i]==null) continue;
            for(int c=0;c<cost.length;c++){
                if(cost[c]==-1)continue;
                if(i+cost[c]<dp.length)dp[i+cost[c]] = better(dp[i+cost[c]], (c+1)+dp[i]);
            }
        }
        if(dp[target]==null) return "0";
        else return dp[target];
    }
    String better(String a, String b){
        if(a==null) return b;
        if(a.length()>b.length()) return a;
        if(b.length()>a.length()) return b;
        return (a.compareTo(b)>0)? a: b;
    }
}