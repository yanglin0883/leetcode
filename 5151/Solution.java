class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome==null||palindrome.length()<2) return "";
        char[] str = palindrome.toCharArray();
        for(int i=0;i<str.length/2;i++){
            if(str[i]>'a'){
                str[i] = 'a';
                return new String(str);
            }
        }
        str[str.length-1] = 'b';
        return new String(str);
    }
}