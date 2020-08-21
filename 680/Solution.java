class Solution {
    public boolean validPalindrome(String s) {
        if(s==null|| s.length()<2) return true;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                //if(right==s.length()-1) return isPalin(s.substring(left, right));
                return isPalin(s.substring(left, right)) ||
                       isPalin(s.substring(left+1,right+1));
            }
            left++;
            right--;
        }
        return true;
    }
    
    private boolean isPalin(String s){
        if(s==null|| s.length()<2) return true;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}