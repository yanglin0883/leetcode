class Solution {
    public String reverseStr(String s, int k) {
        if(s==null||s.length()<2||k<2) return s;
        char[] str = s.toCharArray();
        for(int i=0;i<str.length;i+=k*2){
            int left=i;
            int right=Math.min(str.length, i+k)-1;
            while(left<right){
                char temp = str[left];
                str[left++] = str[right];
                str[right--] = temp;
            }
        }
        return new String(str);
    }
}