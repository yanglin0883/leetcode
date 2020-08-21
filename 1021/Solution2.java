class Solution {
    public String removeOuterParentheses(String S) {
       int count=0;
        StringBuilder res = new StringBuilder();
        for(char temp : S.toCharArray()){
            if(temp=='('){
                if(++count==1) continue;
            }
            else{
                if(--count==0) continue;
            }
            res.append(temp);
        }
        return res.toString();
    }
}