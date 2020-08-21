class Solution {
    public boolean checkValidString(String s) {
        if(s.length()==0) return true;
        this.s = s;
        return dfs(0,0);
    }
    String s;
    boolean dfs(int cur, int bal){
        if(cur==s.length()) return bal==0;
        if(bal<0) return false;
        if(s.charAt(cur)=='(') return dfs(cur+1, bal+1);
        if(s.charAt(cur)==')') return dfs(cur+1, bal-1);
        return dfs(cur+1, bal+1) || dfs(cur+1, bal) || dfs(cur+1, bal-1);
    }
}