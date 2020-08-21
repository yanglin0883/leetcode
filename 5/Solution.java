class Solution {
    private class Max{
        int max,start,end;
        Max(){}
        Max(int a, int b){
            max=b-a;
            start = a;
            end = b;
        }
    }
    public String longestPalindrome(String s) {
        if(s==null||s.length()==0) return s;
        char[] str = s.toCharArray();
        Max max = new Max();
        for(int i=0;i<str.length;i++){
            Max temp = longestPalin(str, i, i);
            if(temp.max>max.max) max=temp;
            temp=longestPalin(str, i, i+1);
            if(temp.max>max.max) max=temp;
        }
        //System.out.println(max.max+"  "+max.start+" , "+max.end);
        return new String(str, max.start, max.end+1-max.start);
    }
    
    private Max longestPalin(char[] str, int left, int right){
        if(left<0||right>=str.length||str[left]!=str[right]) return new Max();
        while(left>-1&&right<str.length){
            if(str[left]!=str[right]) break;
            left--;
            right++;
        }
        return new Max(left+1, right-1); 
    }
}