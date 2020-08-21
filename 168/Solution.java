class Solution {
    public String convertToTitle(int n) {
        if(n<1) return "";
        StringBuilder res = new StringBuilder();
        while(n>0){
            n--;
            int temp = n%26;
            res.append(toChar(temp));
            n/=26;
        }
        return new String(res.reverse());
    }
    char toChar(int temp){        
        return (char)(temp+'A');
    }
}