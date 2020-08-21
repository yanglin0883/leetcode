class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch: expression.toCharArray()){
            //if(!isValid(ch))throw new RuntimeException("invalid input!");
            if(ch!=')')
                stack.push(ch);
            else{
                List<Character> temp = new ArrayList<Character>();
                while(stack.peek()!='('){
                    temp.add(stack.pop());
                }
                stack.pop();
                char sign = stack.pop();
                stack.push(doit(sign, temp));
            }
        }
        char res = stack.pop();
        return val(res);
    }
    
    private boolean val(char c){
        if(c=='t') return true;
        else return false;
    }
    private char toChar(boolean b){
        if(b) return 't';
        else return 'f';
    }
    
    private char doit(char sign, List<Character> para){
        switch(sign){
            case '!':
                return toChar(!val(para.get(0).charValue()));
            case '&':
                return toChar(andOperation(para));
            case '|':
                return toChar(orOperation(para));
            default: return ' ';
        }
    }
    
    private boolean andOperation(List<Character> para){
        for(Character i: para)
            if(i=='f') return false;
        return true;
    }
    private boolean orOperation(List<Character> para){
        for(Character i: para)
            if(i=='t') return true;
        return false;
    }
}