class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n<1) return res;
        StringBuilder current = new StringBuilder();
        current.append('(');
        dfs(n-1, n, current, res);
        return res;
    }
    
    private void dfs(int left, int right, StringBuilder current, List<String> res){
        if(left==0&&right==0){
            res.add(current.toString());
            return;
        }
        if(right>left){        
            current.append(')');
            dfs( left, right-1, current, res);  
            current.deleteCharAt(current.length()-1);
        } 
        if(left>0){
            current.append('(');
            dfs(left-1, right, current, res);            
            current.deleteCharAt(current.length()-1);
        }
    }
}