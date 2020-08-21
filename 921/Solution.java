class Solution {
    public int minAddToMakeValid(String S) {
        int count=0, stack=0;
        for(char c: S.toCharArray()){
            if(c=='('){
                stack++;
            }else{
                stack--;
                if(stack<0){
                    count++;
                    stack=0;
                }
            }
        }
        count += stack;
        return count;
    }
}