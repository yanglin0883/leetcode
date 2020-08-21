class Solution {
    public int longestAwesome(String s) {
        int[] sum = new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            sum[i+1] = sum[i];
            int t = s.charAt(i)-'0';
            int mask = 1<<t;
            sum[i+1] ^= mask;
        }
        int res=0;
        for(int i=0;i<sum.length;i++){
            for(int j=sum.length-1;j-i>=res ;j--){
                if(check(sum[i], sum[j])) res = Math.max(res, j-i);
            }
        }
        return res;
    }
    boolean check(int a, int b){
        int res = a^b;
        return (res&(res-1)) == 0;
    }
}