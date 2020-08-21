class Solution {
    public String removeKdigits(String num, int k) {
        int size = num.length();
        if(k==size) return "0";
        Stack<Character> stack = new Stack();
        for(int i=0;i<size;i++){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i)){
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}