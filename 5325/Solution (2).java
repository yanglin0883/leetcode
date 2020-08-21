class Solution {
    public int numberOfSubstrings(String s) {
        int l=0;
        int[] count={0,0,0};
        char[] str = s.toCharArray();
        int ans=0;
        for(int i=0;i<str.length;i++){
            count[str[i]-'a']++;
            while(count[0]>0&&count[1]>0&&count[2]>0){
                count[str[l]-'a']--;
                l++;
            }
            ans+=l;
        }
        return ans;
    }
}