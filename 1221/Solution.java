class Solution {
    public int balancedStringSplit(String s) {
        int count=0, res=0;
        for(char temp: s.toCharArray()){
            if(temp=='L')count++;
            else count--;
            if(count==0) res++;
        }
        return res;
    }
}