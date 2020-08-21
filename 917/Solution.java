class Solution {
    public String reverseOnlyLetters(String S) {
        if(S==null||S.length()<2)return S;
        int left=0;
        char[] str=S.toCharArray();
        int right=str.length-1;
        while(left<right){
            while(left<right&&!Character.isLetter(str[left])) left++;
            while(left<right&&!Character.isLetter(str[right])) right--;
            char temp=str[left];
            str[left++]=str[right];
            str[right--]=temp;
        }
        return new String(str);
    }
}