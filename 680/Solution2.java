class Solution {
    public boolean validPalindrome(String s) {
        if(s==null|| s.length()<2) return true;
        int left=0;
        int right=s.length()-1;
        char[] str= s.toCharArray();
        while(left<right){
            if(str[left]!=str[right]){                
                return isPalin(str,left,right) ||
                       isPalin(str,left+1,right+1);
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isPalin(char[] s,int start, int end){
        if(s==null|| s.length<2) return true;
        int left=start;
        int right=end-1;
        while(left<right){
            if(s[left]!=s[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
}