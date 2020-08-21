class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList();
        if(s.length()==0) {res.add(new ArrayList());return res;}
        if(s.length()==1){
            res.add(new ArrayList());
            res.get(0).add(s);
            return res;
        }
        this.s =s.toCharArray();
        List<Integer>path = new ArrayList<Integer>();
        path.add(-1);
        dfs(res, path, 0);
        return res;
    }
    char[] s;
    void dfs(List<List<String>>res, List<Integer>path, int cur){
        // System.out.println(cur);
        if(cur>=s.length) {
            // System.out.println("res:"+path);
            res.add(getStrings(path));
            return;
        }
        int left = path.get(path.size()-1)+1;
        for(int right=cur;right<s.length;right++){
            if(isPalindrome(left, right)){
                path.add(right);
                // System.out.println(path);
                dfs(res, path, right+1);
                path.remove(path.size()-1);
            }
        }
    }
    boolean isPalindrome(int left, int right){
        // System.out.println("isP: "+left+"  "+right);
        while(left<right){
            if(s[left++]!=s[right--]) return false;
        }
        return true;
    }
    ArrayList<String> getStrings(List<Integer> path){
        ArrayList<String> res = new ArrayList();
        int pre = 0;
        for(int i=1;i<path.size();i++){
            res.add(new String(s, pre, path.get(i)-pre+1));
            pre = path.get(i)+1;
        }
        return res;
    }
}