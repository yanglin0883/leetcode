class Solution {
    public String reverseWords(String s) {
        if(s==null||s.length()<2) return new String(s);
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;){
            int left=i;
            while(i<str.length&&str[i]!=' ')i++;
            int right = i-1;
            while(left<right){
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
            }
            while(i<str.length&&str[i]==' ')i++;
        }
        return new String(str);
    }
}