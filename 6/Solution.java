class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] res = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++)
            res[i] = new StringBuilder();
        int j=0;
        for(int i=0;i<s.length();i++){
            res[j].append(s.charAt(i));
            if(i%((numRows-1)*2) < (numRows-1)) j++;
            else j--;
        }
        
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;i++)
            ans.append(res[i]);
        return ans.toString();
    }
}