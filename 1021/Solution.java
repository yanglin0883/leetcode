class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char temp : S.toCharArray()){
            if(stack.isEmpty()) {
                stack.push(temp);
                continue;
            }
            if(temp=='(') stack.push(temp);
            else{
                stack.pop();
                if(stack.isEmpty()) continue;
            }
            res.append(temp);
        }
        return res.toString();
    }
}