class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int digits[] = new int[10];
        int len=0;
        while(x>0){
            digits[len++] = x%10;
            x/=10;
        }
        int left=0;
        int right=len-1;
        while(left<right){
            if(digits[left++] != digits[right--]) return false;
        }
        return true;
    }
}