class Solution {
    public boolean backspaceCompare(String S, String T) {
        int s = S.length()-1;
        int t = T.length()-1;
        while(s>-1&&t>-1){
            int s0 = valid(S, s);
            int t0 = valid(T, t);
            if(s0==-1) return t0==-1;
            if(t0==-1) return s0==-1;
            if(S.charAt(s0)!=T.charAt(t0)) return false;
            s=s0-1;
            t=t0-1;
        }
        //System.out.println(s+"  "+t);
        
        if(s==-1) return valid(T, t)==-1;
        else return valid(S, s)==-1;
        //return true;
    }
    //from p(included) forward, the first valid index, if no return -1
    private int valid(String str, int p){
        int num = 0;
        for(int i=p;i>-1;i--){
            //System.out.println(str.charAt(i));
            if(num==0&&str.charAt(i) != '#') return i;
            if(str.charAt(i) == '#')num++;
            else num--;
        }
        return -1;
    }
}