class Solution {
    public int numSteps(String s) {
        if(s.equals("1")) return 0;
        int steps=0;
        while(!s.equals("1")){
            steps++;
            s=getNext(s);
        }
        return steps;
    }
    String getNext(String s){
        StringBuilder temp = new StringBuilder(s);
        if(temp.charAt(temp.length()-1)=='0')temp.deleteCharAt(temp.length()-1);
        else{
            int last = temp.length()-1;
            while(last>0){
                temp.replace(last, last+1,"0");
                if(temp.charAt(last-1)=='0'){
                    temp.replace(last-1, last,"1");
                    break;
                }
                last--;
            }
            if(last==0)temp.insert(1,"0");
        }
        return temp.toString();
    }
}