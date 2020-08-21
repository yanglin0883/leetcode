class Solution {
    public boolean checkRecord(String s) {
        int a=0, l=0;
        for(char c:s.toCharArray()){
            if(c=='L'){
                if(++l>2) return false;
            }
            else
                l=0;
            if(c=='A') a++;
        }
        if(a>1) return false;
        else return true;
    }
}