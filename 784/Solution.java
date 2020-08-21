class Solution {
    public List<String> letterCasePermutation(String S) {
        dfs(S, 0, new StringBuilder());
        return res;
    }
    List<String> res = new ArrayList<>();
    void dfs(String s, int index, StringBuilder path){
        if(index == s.length()){
            res.add(path.toString());
            return;
        }
        char cur = s.charAt(index);
        if(cur>='0'&&cur<='9'){
            path.append(cur);
            dfs(s, index+1, path);
        }
        else{
            if(cur>='a') cur = (char)(cur-'a'+'A');
            path.append(cur);
            dfs(s, index+1, path);
            path.deleteCharAt(path.length()-1);
            cur = (char)(cur-'A' + 'a');
            path.append(cur);
            dfs(s, index+1, path);            
        }
        path.deleteCharAt(path.length()-1);
    }
}