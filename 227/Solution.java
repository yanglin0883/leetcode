class Solution {
    public int calculate(String s) {
        if(s==null|| s.length()==0) return 0;
        ArrayList<Integer> operand = new ArrayList<Integer>();
        ArrayList<Character> operator = new ArrayList<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== ' ') continue;
            int num=0;
            int j=i;
            for(j=i;j<s.length()&&isNum(s.charAt(j));j++){
                num*=10;
                num += (int) ( s.charAt(j) - '0');
            }
            operand.add(num);
            while(j<s.length() && s.charAt(j)==' ')j++;
            if(j!=s.length()){
                operator.add(s.charAt(j));
            }
            i=j;
        }
        for(int i=0;i<operator.size();i++){            
            if(operator.get(i)== '*'){
                operand.set(i, operand.get(i)*operand.get(i+1));
                operand.remove(i+1);
                operator.remove(i);
                i--;
            }
            else if(operator.get(i)== '/'){
                operand.set(i, operand.get(i)/operand.get(i+1));
                operand.remove(i+1);
                operator.remove(i);
                i--;
            }
        }
        for(int i=0;i<operator.size();i++){            
            if(operator.get(i)== '+'){
                operand.set(i, operand.get(i)+operand.get(i+1));
                operand.remove(i+1);
                operator.remove(i);
                i--;
            }
            else if(operator.get(i)== '-'){
                operand.set(i, operand.get(i)-operand.get(i+1));
                operand.remove(i+1);
                operator.remove(i);
                i--;
            }
        }
        return operand.get(0).intValue();
    }
    
    private boolean isNum(char c){
        if(c<'0'||c>'9') return false;
        else return true;
    }
}