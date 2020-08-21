class Solution {
    public String generateTheString(int n) {
        StringBuilder res = new StringBuilder();
        if(n%2==0) {res.append('a');n--;}
        for(;n>0;n--)
            res.append('b');
        return res.toString();
    }
}