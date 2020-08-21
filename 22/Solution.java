class Solution {
    public List<String> generateParenthesis(int n) {
        Set<String> res = new HashSet<>();
        dfs(res, n, new StringBuilder());
        return new ArrayList<>(res);
    }
    void dfs(Set<String> res, int n, StringBuilder current){
        //System.out.println(n+"  "+current);
        if(n==0){
            res.add(current.toString());
            return;
        }
        int len = current.length();
        for(int i=0;i<=len;i++){
            current.insert(i, '(');
            for(int j=i;j<=len;j++){
                if(current.charAt(j)==')') continue;
                current.insert(j+1, ')');
                dfs(res, n-1, current);
                current.deleteCharAt(j+1);
            }
            current.deleteCharAt(i);
        }
    }
}
//time limit
