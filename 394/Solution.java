class Solution {
    public String decodeString(String s) {
        if(s==null||s.length()==0) return s;
        Stack<Character> s1= new Stack<Character>();
        
        for(char ch: s.toCharArray()){
            // print(s1);
            if(ch==']'){
                StringBuilder temp = new StringBuilder();
                while(s1.peek()!='['){
                    temp.append(s1.pop());
                }
                s1.pop();
                temp.reverse();
                StringBuilder digit = new StringBuilder();
                
                while(!s1.empty()&&Character.isDigit(s1.peek())){
                    digit.append(s1.pop());
                    //System.out.println(digit.toString());
                }
                int k=0;
                int d=1;
                //print(s1);
                // System.out.println("digit: "+digit.toString());
                for(int i=0;i<digit.length();i++){
                    k += d*(int)(digit.charAt(i)-'0');
                    d*=10;                    
                }
                // System.out.println("k: "+k+" d: "+d);
                for(int i=0;i<k;i++){
                    for(int j=0;j<temp.length();j++){
                        s1.push(temp.charAt(j));
                    }
                    //print(s1);
                    // System.out.println(temp.toString());
                }
            }else{
                s1.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while(!s1.empty()){
            res.append(s1.pop());
        }
        return res.reverse().toString();
        
    }
    void print(Stack a){
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+", ");
        }
        System.out.println();
    }
    
}