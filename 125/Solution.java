class Solution {
    public boolean isPalindrome(String s) {
        if(s==null||s.length()<2)return true;
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left)))left++;
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right)))right--;
            if(!same(s.charAt(left), s.charAt(right))) return false;
            left++;
            right--;
        }
        return true;
    }
    private boolean same(char a, char b){
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}