class Solution {
    public String stringShift(String s, int[][] shift) {
        if(s==null||s.length()<2||shift==null||shift.length==0) return s;
        int sum = 0;
        for(int[] i: shift){
            if(i[0]==0) sum+=i[1];
            else sum-=i[1];
        }
        sum%=s.length();
        if(sum<0)sum+=s.length();
        return helper(s, sum);
    }
    String helper(String s, int n){
        char[] temp = s.toCharArray();
        swap(temp, 0, n-1);
        swap(temp, n, temp.length-1);
        swap(temp, 0, temp.length-1);
        return new String(temp);
    }
    void swap(char[] t, int start, int end){
        char temp;
        while(start<end){
            temp = t[start];
            t[start++] = t[end];
            t[end--] = temp;
        }
    }
}