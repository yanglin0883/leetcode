class Solution {
    public boolean judgeCircle(String moves) {
        if(moves==null || moves.length()==0) return true;
        int xAxis=0;
        int yAxis=0;
        for(int i=0;i<moves.length();i++){
            char temp=moves.charAt(i);
            switch(temp){
                case 'U': xAxis++; break; case 'D': xAxis--; break;
                case 'R': yAxis++; break; case 'L': yAxis--; break;
                default: throw new RuntimeException("syntax is error!");
            }
        }
        if(xAxis==0 &&yAxis==0) return true;
        else return false;
    }
}