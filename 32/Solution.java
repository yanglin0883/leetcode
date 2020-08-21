class Solution {
    public int longestValidParentheses(String s) {
        if(s==null||s.length()<2) return 0;
        int max=0;
        s= ")" +s;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else{
                if(stack.isEmpty()||stack.peek()<=0){
                    stack.push(-i);
                }
                else{
                    stack.pop();
                    max= Math.max(max, i-Math.abs(stack.peek()));
                }
            }
        }
        return max;
    }
}