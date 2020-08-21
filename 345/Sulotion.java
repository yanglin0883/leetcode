class Solution {
    public String reverseVowels(String s) {
        if(s==null || s.length()<2) return s;
        char[] str = s.toCharArray();
        int left=0;
        int right=str.length-1;
        while(left<right){
            while(left<right&&!isVowel(str[left]))left++;
            while(left<right&&!isVowel(str[right]))right--;
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return new String(str);
    }
    private boolean isVowel(char c){
        switch(c){
                case 'a':case 'e':case 'i':case 'o':case 'u':
                case 'A':case 'E':case 'I':case 'O':case 'U': return true;
            default: return false;
        }
    }
}