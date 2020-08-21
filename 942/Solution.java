class Solution {
    public int[] diStringMatch(String S) {
        int len = S.length();
        int a=0, b=len;
        int[] ans = new int[len+1];
        for(int i=0;i<len;i++)
            if(S.charAt(i)=='I')
                ans[i] = a++;
            else 
                ans[i] = b--;
        ans[len] = a;
        return ans;
    }
}