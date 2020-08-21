class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        char[] digits = new Integer(x).toString().toCharArray();
        int left = 0;
        int right = digits.length-1;
        while(left<right){
            if(digits[left++] != digits[right--]) return false;
        }
        return true;
    }
}