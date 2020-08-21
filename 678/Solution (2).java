class Solution {
    public boolean checkValidString(String s) {
        if(s.length()==0) return true;
        Stack<Integer> left=new Stack();
        Stack<Integer> star = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            // System.out.println(left+"  "+star);
            if(c=='(') left.push(i);
            else if(c=='*') star.push(i);
            else{
                if(left.size()>0) left.pop();
                else if(star.size()>0) star.remove(0);// we should remove the leftest part and leave the rightest stars for(
                else return false;
            }
            
        }
        // System.out.println(left+"  "+star);
        t:while(!left.isEmpty() && !star.isEmpty()){
            if(left.peek()>star.peek())break;
            left.pop();
            star.pop();
            // System.out.println(left+"  "+star);
        }
        return left.isEmpty();
    }
}