class Solution {
    public int minFlipsMonoIncr(String S) {
        char[] str = S.toCharArray();
        int P[] = new int[str.length+1];
        for(int i=0;i<str.length;i++)
            P[i+1] = P[i]+(str[i]-'0');
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<=str.length;i++){
            ans = Math.min(ans, P[i] + str.length-i-(P[str.length]-P[i]));
        }
        return ans;
    }
}
//dp