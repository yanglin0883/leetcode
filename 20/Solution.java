class Solution {
    public boolean isValid(String s) {
        if(s.equals("")) return true;
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(left(temp)) stack.push(temp);
            else if(right(temp)){
                if(stack.isEmpty()) return false;
                char ch=stack.pop();
                if(!match(ch, temp)) return false;
            }else return false;
        }
        if(stack.isEmpty())return true;
        return false;
    }
    private boolean left(char a){
        if(a=='('||a=='['||a=='{') return true;
        return false;
    }
    private boolean right(char a){
        if(a==')'||a==']'||a=='}') return true;
        return false;
    }
    private boolean match(char ch1, char ch2){
        if(ch1=='('&&ch2==')') return true;
        if(ch1=='['&&ch2==']') return true;
        if(ch1=='{'&&ch2=='}') return true;
        return false;
    }
}